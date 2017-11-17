package week10.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    private Connection connection;

    public UserDao() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/base1?autoReconnect=true&useSSL=false";
        String user = "root";
        String password = "root";
        connection = DriverManager.getConnection(url, user, password);
    }

    public void insertUser(User user){
        try {
            PreparedStatement preparedStatement =
                    connection.prepareStatement("INSERT INTO  user (id, name, password, age, carId) " +
                    "VALUE (?, ?, ?, ?, ?);");
            int i = 1;
            if(user.getId() != null) preparedStatement.setLong(i++, user.getId());
            preparedStatement.setString(i++, user.getName());
            preparedStatement.setString(i++, user.getPassword());
            if(user.getAge() != null) preparedStatement.setInt(i++, user.getAge());
            if(user.getCarId() != null) preparedStatement.setLong(i++, user.getCarId());

            preparedStatement.execute();
        } catch (SQLException e) {
            System.err.println("Some exception during creating new user : " + e.getMessage());
        }
    }

    public List<User> getAllUsers(){
        List<User> users = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from user;");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                User user = userMapping(resultSet);
                users.add(user);
            }
        } catch (SQLException e) {
            System.err.println("Some exception during selecting users : " + e.getMessage());
        }
        return users;
    }

    public User getUser(long id) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from user where id = ?;");
            preparedStatement.setLong(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();
            return userMapping(resultSet);

        } catch (SQLException e) {
            System.err.println("Some exception during selecting user : " + e.getMessage());
        }
        return null;
    }

    private User userMapping(ResultSet resultSet) throws SQLException {
        User user = new User();

        try {
            user.setAge(resultSet.getInt("age"));
        } catch (Exception e) {
            user.setAge(null);
        }

        user.setId(resultSet.getLong("id"));
        user.setName(resultSet.getString("name"));
        user.setPassword(resultSet.getString("password"));

        try {
            user.setCarId(resultSet.getLong("carId"));
        } catch (Exception e) {
            user.setAge(null);
        }
        return user;
    }

}

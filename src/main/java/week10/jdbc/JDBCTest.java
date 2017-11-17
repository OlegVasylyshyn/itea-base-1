package week10.jdbc;

import java.sql.*;

public class JDBCTest {

    private static Connection connection;

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        init();
        selectAllUsers();
        insertUser(3L, "Jason", "root", 44, null);
        System.out.println("\nAfter insert\n");
        selectAllUsers();
    }

    private static void init() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/base1?autoReconnect=true&useSSL=false";
        String user = "root";
        String password = "root";
        connection = DriverManager.getConnection(url, user, password);
    }

    private static void selectAllUsers() throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("select * from user;");
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {

            System.out.println();
            System.out.println("User id - " + resultSet.getLong("id"));
            System.out.println("User name - " + resultSet.getString("name"));
            System.out.println("User password - " + resultSet.getString("password"));
            System.out.println("User age - " + resultSet.getInt("age"));
            System.out.println("User carId - " + resultSet.getInt("carId"));

        }
    }

    private static void insertUser(Long id, String name, String pass, Integer age, Long carId) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO  user (id, name, password, age) " +
                "VALUE (?, ?, ?, ?);");
        int i = 1;
        if(id != null) preparedStatement.setLong(i++, id);
        preparedStatement.setString(i++, name);
        preparedStatement.setString(i++, pass);
        if(age != null) preparedStatement.setInt(i++, age);
        if(carId != null) preparedStatement.setLong(i++, carId);

        preparedStatement.execute();
    }

}

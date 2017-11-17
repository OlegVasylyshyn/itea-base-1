package week10.jdbc;

import java.sql.SQLException;

public class UserDaoTest {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        UserDao userDao = new UserDao();


        System.out.println("All users");
        System.out.println(userDao.getAllUsers());



        User user = new User();
        user.setId(4L);
        user.setName("James");
        user.setPassword("www");
        user.setAge(33);
        user.setCarId(1L);


        userDao.insertUser(user);
        System.out.println("User was successfully added");

        System.out.println("Check all users again");
        System.out.println(userDao.getAllUsers());

    }

}

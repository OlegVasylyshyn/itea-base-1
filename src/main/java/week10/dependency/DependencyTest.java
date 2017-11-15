package week10.dependency;

import com.google.gson.Gson;

import javax.swing.*;

public class DependencyTest extends JFrame {

    private DependencyTest(){}

    public static void main(String[] args) {

        User user = new User();
        user.age = 33;
        user.name = "Dexter";

        Gson gson = new Gson();
        String json = gson.toJson(user);

        System.out.println("User jason : " + json);

        User fromJson = gson.fromJson(json, User.class);
        System.out.println("User from json : " + fromJson);

        JOptionPane.showMessageDialog(null, "Hello world");

    }

}


class User {

    public String name;
    public int age;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}

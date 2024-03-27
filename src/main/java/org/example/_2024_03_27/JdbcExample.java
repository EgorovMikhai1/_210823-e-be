package main.java.org.example._2024_03_27;

import java.sql.*;

public class JdbcExample {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/abab";
        String username = "root";
        String password = "123123";
        String selectSQL = "SELECT * FROM author";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, username, password);

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(selectSQL);

        while (resultSet.next()) {
            System.out.println("ID: " + resultSet.getInt("id"));
        }
    }
}
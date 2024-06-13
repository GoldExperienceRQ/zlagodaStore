package org.example.javawebapp.dao.jdbc;

import java.sql.*;

public class MySql {
    private static final String DATABASE_URL = "jdbc:mysql://127.0.0.1:3306/zlagoda_store_schema";
    private static final String DATABASE_USER = "root";
    private static final String DATABASE_PASSWORD = "my_sql";
    public static Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return  connection;
    }
}

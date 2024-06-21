package org.example.javawebapp.dao.jdbc;

import java.sql.Connection;
import java.sql.*;

public class ComplexCommandJDBCDao {
    Connection connection;

    public ComplexCommandJDBCDao() {
        connection = MySql.getConnection();
    }

    public void complexCommandOne()  {
        try{
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT c.category_name, p.product_name, " +
                    "SUM(pis.quantity) AS total_quantity FROM category c JOIN product p ON c.category_id = p.category_id" +
                    " JOIN product_in_store pis ON p.product_id = pis.product_id GROUP BY c.category_name, p.product_name");
            while(rs.next()){
                System.out.println("Category: " + rs.getString("category_name") + ", Product: " + rs.getString("product_name") + ", Total quantity: " + rs.getInt("total_quantity"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void complexCommandTwo() {
        try{
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT cl.client_name FROM client cl WHERE EXISTS (" +
                    "SELECT 1 FROM store_check ch WHERE ch.client_id = cl.client_number) AND NOT EXISTS (" +
                    "SELECT 1 FROM store_check ch WHERE ch.client_id = cl.client_number AND NOT ch.employee_id = 'employee2') ");
            while(rs.next()){
                System.out.println("Client: " + rs.getString("client_name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

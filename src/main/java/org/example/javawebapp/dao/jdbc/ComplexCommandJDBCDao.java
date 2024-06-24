package org.example.javawebapp.dao.jdbc;

import java.sql.Connection;
import java.sql.*;

public class ComplexCommandJDBCDao {
    Connection connection;

    public ComplexCommandJDBCDao() {
        connection = MySql.getConnection();
    }

    public String complexQueryOne()  {
        StringBuilder result = new StringBuilder();
        try{
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT c.category_name, p.product_name, " +
                    "SUM(pis.quantity) AS total_quantity FROM category c JOIN product p ON c.category_id = p.category_id" +
                    " JOIN product_in_store pis ON p.product_id = pis.product_id GROUP BY c.category_name, p.product_name");
            while(rs.next()){
                result.append("Category: ").append(rs.getString("category_name")).append(", Product: ").append(rs.getString("product_name")).append(", Total quantity: ").append(rs.getInt("total_quantity")).append("<br/>");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result.toString();
    }
    public String complexQueryTwo() {
        StringBuilder result = new StringBuilder();
        try{
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT cl.client_name FROM client cl WHERE EXISTS (" +
                    "SELECT 1 FROM store_check ch WHERE ch.client_id = cl.client_number) AND NOT EXISTS (" +
                    "SELECT 1 FROM store_check ch WHERE ch.client_id = cl.client_number AND NOT ch.employee_id = 'employee2') ");
            while(rs.next()){
               result.append("Client: ").append(rs.getString("client_name")).append("<br/>");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result.toString();
    }
    public String complexCommandOneDima() {
        StringBuilder result = new StringBuilder();
        try{
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT employee_id, employee_name, employee_surname\n" +
                    "FROM employee e\n" +
                    "WHERE NOT EXISTS (\n" +
                    "    SELECT 1\n" +
                    "    FROM store_check sc\n" +
                    "    WHERE sc.employee_id = e.employee_id\n" +
                    "    AND NOT EXISTS (\n" +
                    "        SELECT 1\n" +
                    "        FROM client c\n" +
                    "        WHERE c.client_number = sc.client_id\n" +
                    "        AND sc.sum > 1512\n" +
                    "    )\n" +
                    ")");
            while(rs.next()){
                result.append("Employee: ").append(rs.getString("employee_id")).append(", ").append(rs.getString("employee_name")).append(", ")
                        .append(rs.getString("employee_surname"))
                        .append("<br/>");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result.toString();
    }
    public String complexCommandTwoDima() {
        StringBuilder result = new StringBuilder();
        try{
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT\n" +
                    "    c.category_name,\n" +
                    "    p.product_name\n" +
                    "FROM\n" +
                    "    product_in_store pis,\n" +
                    "    product p,\n" +
                    "    category c\n" +
                    "WHERE\n" +
                    "    pis.product_id = p.product_id\n" +
                    "    AND p.category_id = c.category_id\n" +
                    "GROUP BY\n" +
                    "    c.category_name,\n" +
                    "    p.product_name\n" +
                    "ORDER BY\n" +
                    "    c.category_name,\n" +
                    "    p.product_name;");
            while(rs.next()){
                result.append("Category: ").append(rs.getString("category_name")).append(", Product: ").append(rs.getString("product_name")).append("<br/>");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result.toString();
    }
    public String complexCommandOneVlada() {
        StringBuilder result = new StringBuilder();
        try{
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT e.employee_id, e.employee_name, e.employee_surname, COUNT(c.check_number) AS total_checks\n" +
                    "FROM Employee e\n" +
                    "JOIN store_check c ON e.employee_id = c.employee_id\n" +
                    "JOIN client cc ON c.client_id = cc.client_number\n" +
                    "WHERE e.salary > 500\n" +
                    "AND c.sum > 150\n" +
                    "GROUP BY e.employee_id, e.employee_name, e.employee_surname;");
            while(rs.next()){
                result.append("Employee: ").append(rs.getString("employee_id")).append(", ").append(rs.getString("employee_name")).append(", ")
                        .append(rs.getString("employee_surname")).append(", Total checks: ").append(rs.getInt("total_checks"))
                        .append("<br/>");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result.toString();
    }
    public String complexCommandTwoVlada() {
        StringBuilder result = new StringBuilder();
        try{
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT e.employee_id, e.employee_name, e.employee_surname\n" +
                    "FROM employee e\n" +
                    "WHERE e.city NOT IN ('Kyiv', 'London')\n" +
                    "AND NOT EXISTS (\n" +
                    "    SELECT 1\n" +
                    "    FROM store_check c\n" +
                    "    WHERE c.employee_id = e.employee_id\n" +
                    "    AND EXISTS (\n" +
                    "        SELECT 1\n" +
                    "        FROM client cc\n" +
                    "        WHERE cc.client_number = c.client_id\n" +
                    "        AND cc.client_city IN ('Lviv', 'London')\n" +
                    "    )\n" +
                    ")");
            while(rs.next()){
                result.append("Employee: ").append(rs.getString("employee_id")).append(", ").append(rs.getString("employee_name")).append(", ")
                        .append(rs.getString("employee_surname")).append("<br/>");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result.toString();
    }
}

package org.example.javawebapp.dao.jdbc;

import org.example.javawebapp.dao.GenericDao;
import org.example.javawebapp.entity.Check;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CheckJDBCDao implements GenericDao<Check> {
    Connection connection;

    public CheckJDBCDao() {
        connection = MySql.getConnection();
    }

    @Override
    public List<Check> getAll() {
        List<Check> checks = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM store_check");
            while (rs.next()) {
                Check check = new Check(
                        rs.getString("check_number"),
                        rs.getString("employee_id"),
                        rs.getString("client_id"),
                        rs.getString("print_date"),
                        rs.getDouble("sum")
                );
                checks.add(check);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return checks;
    }

    @Override
    public void create(Check e) {
        try{
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO store_check (check_number, employee_id, client_id, print_date, sum, vat) VALUES ('" + e.getCheckNumber() + "', '" + e.getEmployeeId() + "', '" + e.getClientId() + "', '" + e.getPrintDate() + "', " + e.getSum() + "," + e.getVat() + ")");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void update(Check e) {
        System.out.println(e.getCheckNumber());
        System.out.println(e.getEmployeeId());
        System.out.println(e.getClientId());
        System.out.println(e.getPrintDate());
        System.out.println(e.getSum());

        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate("UPDATE store_check SET employee_id = '" + e.getEmployeeId() + "', client_id = '" + e.getClientId() + "', print_date = '" + e.getPrintDate() + "', sum = " + e.getSum() + ", vat = " + e.getVat() + " WHERE check_number = '" + e.getCheckNumber() + "'");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void delete(Check e) {
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate("DELETE FROM store_check WHERE check_number = '" + e.getCheckNumber() + "'");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public Check getByNumber(String number) {
        Check check = null;
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM store_check WHERE check_number = '" + number + "'");
            if (rs.next()) {
                check = new Check(
                        rs.getString("check_number"),
                        rs.getString("employee_id"),
                        rs.getString("client_id"),
                        rs.getString("print_date"),
                        rs.getDouble("sum")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check;
    }
}

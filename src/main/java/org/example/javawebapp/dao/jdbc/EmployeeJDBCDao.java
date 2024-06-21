package org.example.javawebapp.dao.jdbc;

import org.example.javawebapp.dao.GenericDao;
import org.example.javawebapp.entity.Employee;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeJDBCDao implements GenericDao<Employee> {
    Connection connection;

    public EmployeeJDBCDao() {
        this.connection = MySql.getConnection();
    }

    @Override
    public List<Employee> getAll() {
        System.out.println("In getAll method");
        List<Employee> employees = new ArrayList<>();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM employee");

            while (rs.next()) {
                String employeeId = rs.getString("employee_id");
                String name = rs.getString("employee_name");
                String surname = rs.getString("employee_surname");
                String patronymic = rs.getString("employee_patronymic");
                double salary = rs.getDouble("salary");
                String role = rs.getString("employee_role");
                Date dateOfStart = rs.getDate("date_of_start");
                Date dateOfBirth = rs.getDate("date_of_birth");

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String dateOfStartString = sdf.format(dateOfStart);
                String dateOfBirthString = sdf.format(dateOfBirth);


                String city = rs.getString("city");
                String street = rs.getString("street");
                String index = rs.getString("index");
                String phone = rs.getString("phone_number");
                employees.add(new Employee(employeeId, name, surname, patronymic, role, salary, dateOfStartString, dateOfBirthString, phone, city, street, index));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return employees;
    }

    @Override
    public void create(Employee e) {
        System.out.println("In create method");
        System.out.println(e.getDateOfStart());
        System.out.println(e.getDateOfBirth());
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate("INSERT INTO employee (employee_id, employee_name, employee_surname, employee_patronymic, employee_role, salary, date_of_start, date_of_birth, phone_number, city, street, `index`) VALUES ('" + e.getEmployeeId() + "', '" + e.getName() + "', '" + e.getSurname() + "', '" + e.getPatronymic() + "', '" + e.getRole() + "', " + e.getSalary() + ", '" + e.getDateOfStart() + "', '" + e.getDateOfBirth() + "', '" + e.getPhoneNumber() + "', '" + e.getCity() + "', '" + e.getStreet() + "', '" + e.getIndex() + "')");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void update(Employee e) {
        System.out.println(e.getRole());
        System.out.println(e.getEmployeeId());
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate("UPDATE employee SET employee_name = '" + e.getName() + "', employee_surname = '" + e.getSurname() + "', employee_patronymic = '" + e.getPatronymic() + "', employee_role = '" + e.getRole() + "', salary = " + e.getSalary() + ", date_of_start = '" + e.getDateOfStart() + "', date_of_birth = '" + e.getDateOfBirth() + "', phone_number = '" + e.getPhoneNumber() + "', city = '" + e.getCity() + "', street = '" + e.getStreet() + "', `index` = '" + e.getIndex() + "' WHERE employee_id = '" + e.getEmployeeId() + "'");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void delete(Employee e) {
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate("DELETE FROM employee WHERE employee_id = '" + e.getEmployeeId() + "'");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public Employee getById(String id) {
        Employee employee = null;
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM employee WHERE employee_id = '" + id + "'");

            rs.next();
            String employeeId = rs.getString("employee_id");
            String name = rs.getString("employee_name");
            String surname = rs.getString("employee_surname");
            String patronymic = rs.getString("employee_patronymic");
            double salary = rs.getDouble("salary");
            String role = rs.getString("employee_role");
            Date dateOfStart = rs.getDate("date_of_start");
            Date dateOfBirth = rs.getDate("date_of_birth");

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String dateOfStartString = sdf.format(dateOfStart);
            String dateOfBirthString = sdf.format(dateOfBirth);
            return new Employee(employeeId, name, surname, patronymic, role, salary, dateOfStartString, dateOfBirthString, rs.getString("phone_number"), rs.getString("city"), rs.getString("street"), rs.getString("index"));

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}

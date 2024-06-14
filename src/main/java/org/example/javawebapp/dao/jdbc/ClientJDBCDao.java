package org.example.javawebapp.dao.jdbc;

import org.example.javawebapp.dao.GenericDao;
import org.example.javawebapp.entity.Category;
import org.example.javawebapp.entity.Client;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClientJDBCDao implements GenericDao<Client> {
    Connection connection;

    public ClientJDBCDao() {
        this.connection = MySql.getConnection();
    }

    @Override
    public List<Client> getAll() {
        List<Client> clients = new ArrayList<>();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM client");
            while (rs.next()) {
                String clientNumber = rs.getString("client_number");
                String name = rs.getString("client_name");
                String surname = rs.getString("client_surname");
                String patronymic = rs.getString("client_patronymic");
                String city = rs.getString("client_city");
                String street = rs.getString("client_street");
                String index = rs.getString("client_index");
                String phone = rs.getString("client_phone");
                int percent = rs.getInt("client_percent");
                clients.add(new Client(clientNumber, name, surname, patronymic, city, street, index, phone, percent));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return clients;
    }

    @Override
    public void create(Client e) {
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate("INSERT INTO client (client_number, client_name, client_surname, client_patronymic, client_city, client_street, client_index, client_phone, client_percent) VALUES ('" + e.getClientNumber() + "', '" + e.getName() + "', '" + e.getSurname() + "', '" + e.getPatronymic() + "', '" + e.getCity() + "', '" + e.getStreet() + "', '" + e.getIndex() + "', '" + e.getPhone() + "', " + e.getPercent() + ")");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void update(Client e) {
        try{
            Statement stmt = connection.createStatement();
            stmt.executeUpdate("UPDATE client SET client_name = '" + e.getName() + "', client_surname = '" + e.getSurname() + "', client_patronymic = '" + e.getPatronymic() + "', client_city = '" + e.getCity() + "', client_street = '" + e.getStreet() + "', client_index = '" + e.getIndex() + "', client_phone = '" + e.getPhone() + "', client_percent = " + e.getPercent() + " WHERE client_number = '" + e.getClientNumber() + "'");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void delete(Client e) {
        System.out.println("In client delete");
        try{
            Statement stmt = connection.createStatement();
            stmt.executeUpdate("DELETE FROM client WHERE client_number = '" + e.getClientNumber() + "'");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

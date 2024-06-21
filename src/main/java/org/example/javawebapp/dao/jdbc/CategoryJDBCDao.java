package org.example.javawebapp.dao.jdbc;

import org.example.javawebapp.dao.GenericDao;
import org.example.javawebapp.entity.Category;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CategoryJDBCDao implements GenericDao<Category> {

    Connection connection;
    public CategoryJDBCDao() {
        this.connection = MySql.getConnection();
    }

    @Override
    public List<Category> getAll() {
        List<Category> categories = new ArrayList<>();
        try{
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM category");
            while(rs.next()){
                int id = rs.getInt("category_id");
                String name = rs.getString("category_name");
                categories.add(new Category(id, name));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return categories;
    }

    @Override
    public void create(Category e) {
        try{
            Statement stmt = connection.createStatement();
            stmt.executeUpdate("INSERT INTO category (category_name) VALUES ('" + e.getName() + "')");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void update(Category e) {
        try{
            Statement stmt = connection.createStatement();
            stmt.executeUpdate("UPDATE category SET category_name = '" + e.getName() + "' WHERE category_id = " + e.getId());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void delete(Category e) {
        try{
            Statement stmt = connection.createStatement();
            stmt.executeUpdate("DELETE FROM category WHERE category_id = " + e.getId());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public Category getById(int id) {
        Category category = null;
        try{
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM category WHERE category_id = " + id);
            rs.next();
            String name = rs.getString("category_name");
            return new Category(id, name);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public String getNameById(int id) {
        String name = "";
        try{
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT category_name FROM category WHERE category_id = " + id);
            rs.next();
            name = rs.getString("category_name");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return name;
    }
}

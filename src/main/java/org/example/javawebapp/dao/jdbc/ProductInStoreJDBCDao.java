package org.example.javawebapp.dao.jdbc;

import org.example.javawebapp.dao.GenericDao;
import org.example.javawebapp.entity.ProductInStore;

import java.sql.*;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductInStoreJDBCDao implements GenericDao<ProductInStore> {
    Connection connection;

    public ProductInStoreJDBCDao() {
        this.connection = MySql.getConnection();
    }

    @Override
    public List<ProductInStore> getAll() {
        List<ProductInStore> productsInStore = new ArrayList<>();

        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM product_in_store");

            while (resultSet.next()) {
                ProductInStore productInStore = new ProductInStore(
                    resultSet.getString("upc"),
                    resultSet.getInt("product_id"),
                    resultSet.getDouble("price"),
                    resultSet.getInt("quantity"),
                    resultSet.getBoolean("is_promotional")
                );
                productsInStore.add(productInStore);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return productsInStore;
    }

    @Override
    public void create(ProductInStore e) {
        try{
            Statement stmt = connection.createStatement();
            stmt.executeUpdate("INSERT INTO product_in_store (upc, product_id, price, quantity, is_promotional) VALUES ('" + e.getUpc() + "', " + e.getId() + ", " + e.getPrice() + ", " + e.getQuantity() + ", " + e.getIsPromotional() + ")");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void update(ProductInStore e) {
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate("UPDATE product_in_store SET product_id = " + e.getId() + ", price = " + e.getPrice() + ", quantity = " + e.getQuantity() + ", is_promotional = " + e.getIsPromotional() + " WHERE upc = '" + e.getUpc() + "'");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void delete(ProductInStore e) {
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate("DELETE FROM product_in_store WHERE upc = '" + e.getUpc() + "'");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    public ProductInStore getByUpc(String upc) {
        ProductInStore productInStore = null;
        System.out.println(upc);
        try {
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT * FROM product_in_store WHERE upc = '" + upc + "'");
            resultSet.next();
            productInStore = new ProductInStore(
                resultSet.getString("upc"),
                resultSet.getInt("product_id"),
                resultSet.getDouble("price"),
                resultSet.getInt("quantity"),
                resultSet.getBoolean("is_promotional")
            );
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return productInStore;
    }
}

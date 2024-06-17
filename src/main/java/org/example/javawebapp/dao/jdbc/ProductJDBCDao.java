package org.example.javawebapp.dao.jdbc;

import org.example.javawebapp.dao.GenericDao;
import org.example.javawebapp.entity.Product;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductJDBCDao implements GenericDao<Product> {
    Connection con;

    public ProductJDBCDao() {
        this.con = MySql.getConnection();

    }

    @Override
    public List<Product> getAll() {
        List<Product> products = new ArrayList<>();
        try{
            String query = "SELECT * FROM product";
            ResultSet rs = con.createStatement().executeQuery(query);
            while(rs.next()){
                Product product = new Product(
                        rs.getInt("product_id"),
                        rs.getString("product_name"),
                        rs.getInt("category_id"),
                        rs.getString("product_description")
                );
                products.add(product);
                System.out.println(product.getName() + product.getCategory() + product.getDescription() + product.getId());
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return products;
    }

    @Override
    public void create(Product e) {
        try{

            String query = "INSERT INTO product (product_name, category_id, product_description) VALUES ('" + e.getName() + "', '" + e.getCategory() + "', '" + e.getDescription() + "')";
            con.createStatement().executeUpdate(query);

        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void update(Product e) {
        try{
            String query = "UPDATE product SET product_name = '" + e.getName() + "', category_id = '" + e.getCategory() + "', product_description = '" + e.getDescription() + "' WHERE product_id = " + e.getId();
            con.createStatement().executeUpdate(query);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void delete(Product e) {
        try{
            String query = "DELETE FROM product WHERE product_id = " + e.getId();
            con.createStatement().executeUpdate(query);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public Product getById(int id){
        Product product = null;
        try{
            String query = "SELECT * FROM product WHERE product_id = " + id;
            ResultSet rs = con.createStatement().executeQuery(query);
            rs.next();
            product = new Product(
                        rs.getInt("product_id"),
                        rs.getString("product_name"),
                        rs.getInt("category_id"),
                        rs.getString("product_description"));
            return product;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return product;
    }
}

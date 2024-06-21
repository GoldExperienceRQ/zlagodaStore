package org.example.javawebapp.controller.command.productInStore;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.javawebapp.constance.Page;
import org.example.javawebapp.controller.command.Command;
import org.example.javawebapp.dao.jdbc.CategoryJDBCDao;
import org.example.javawebapp.dao.jdbc.ProductInStoreJDBCDao;
import org.example.javawebapp.dao.jdbc.ProductJDBCDao;
import org.example.javawebapp.entity.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetAllProductsInStoreCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        ProductInStoreJDBCDao productInStoreJDBCDao = new ProductInStoreJDBCDao();
        req.setAttribute("productsInStore", productInStoreJDBCDao.getAll());

        ProductJDBCDao productJDBCDao = new ProductJDBCDao();
        List<Product> products =  productJDBCDao.getAll();

        Map<Integer, String> productMap = new HashMap<>();
        for(Product product: products){
            productMap.put(product.getId(), product.getName());
        }
        req.setAttribute("productMap", productMap);
        return Page.ALL_PRODUCTS_IN_STORE_VIEW;
    }
}

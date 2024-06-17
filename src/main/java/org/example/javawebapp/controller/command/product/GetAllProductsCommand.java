package org.example.javawebapp.controller.command.product;

import jakarta.servlet.http.*;
import org.example.javawebapp.constance.Page;
import org.example.javawebapp.controller.command.Command;
import org.example.javawebapp.dao.jdbc.CategoryJDBCDao;
import org.example.javawebapp.dao.jdbc.ProductJDBCDao;
import org.example.javawebapp.entity.Category;
import org.example.javawebapp.entity.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetAllProductsCommand implements Command {

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {

        ProductJDBCDao productJDBCDao = new ProductJDBCDao();
        req.setAttribute("products", productJDBCDao.getAll());

        CategoryJDBCDao categoryJDBCDao = new CategoryJDBCDao();
        List<Category> categories = categoryJDBCDao.getAll();

        Map<Integer, String> categoryMap = new HashMap<>();
        for(Category category: categories){
            categoryMap.put(category.getId(), category.getName());
        }
        req.setAttribute("categoryMap", categoryMap);
        return Page.ALL_PRODUCTS_VIEW;
    }
}

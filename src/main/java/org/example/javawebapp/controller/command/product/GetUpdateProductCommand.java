package org.example.javawebapp.controller.command.product;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.javawebapp.constance.Page;
import org.example.javawebapp.controller.command.Command;
import org.example.javawebapp.dao.jdbc.CategoryJDBCDao;
import org.example.javawebapp.dao.jdbc.ProductJDBCDao;
import org.example.javawebapp.entity.Product;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class GetUpdateProductCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) throws ExecutionException, ServletException, IOException {

        ProductJDBCDao productJDBCDao = new ProductJDBCDao();
        CategoryJDBCDao categoryJDBCDao = new CategoryJDBCDao();
        Product currentProduct = productJDBCDao.getById(Integer.parseInt(req.getParameter("productId")));
        req.setAttribute("product", currentProduct);
        req.setAttribute("categories", categoryJDBCDao.getAll());
        return Page.UPDATE_PRODUCT_VIEW;
    }
}

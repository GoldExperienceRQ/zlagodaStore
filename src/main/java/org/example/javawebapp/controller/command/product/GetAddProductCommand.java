package org.example.javawebapp.controller.command.product;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.javawebapp.constance.Page;
import org.example.javawebapp.controller.command.Command;
import org.example.javawebapp.dao.jdbc.CategoryJDBCDao;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class GetAddProductCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) throws ExecutionException, ServletException, IOException {
        CategoryJDBCDao categoryJDBCDao = new CategoryJDBCDao();
        req.setAttribute("categories", categoryJDBCDao.getAll());
        return Page.ADD_PRODUCT_VIEW;
    }

}

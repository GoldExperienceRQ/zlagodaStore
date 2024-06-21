package org.example.javawebapp.controller.command.category;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.javawebapp.constance.Page;
import org.example.javawebapp.controller.command.Command;
import org.example.javawebapp.dao.jdbc.CategoryJDBCDao;
import org.example.javawebapp.entity.Category;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class GetUpdateCategoryCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) throws ExecutionException, ServletException, IOException {

        CategoryJDBCDao categoryJDBCDao = new CategoryJDBCDao();
        Category currenCcategory = categoryJDBCDao.getById(Integer.parseInt(req.getParameter("categoryId")));
        req.setAttribute("category", currenCcategory);
        return Page.UPDATE_CATEGORY_VIEW;
    }
}

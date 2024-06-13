package org.example.javawebapp.controller.command.category;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.javawebapp.controller.command.Command;
import org.example.javawebapp.controller.utils.HttpWrapper;
import org.example.javawebapp.controller.utils.RedirectionManager;
import org.example.javawebapp.dao.jdbc.CategoryJDBCDao;
import org.example.javawebapp.entity.Category;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class UpdateCategoryCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) throws ExecutionException, ServletException, IOException {
        CategoryJDBCDao categoryJDBCDao = new CategoryJDBCDao();
        categoryJDBCDao.update(new Category(Integer.parseInt(req.getParameter("category-id")), req.getParameter("category-name")));
        RedirectionManager.redirect(new HttpWrapper(req, res), "/allCategories");
        return RedirectionManager.REDIRECTION;
    }
}

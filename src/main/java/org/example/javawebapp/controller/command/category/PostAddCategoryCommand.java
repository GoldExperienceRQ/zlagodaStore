package org.example.javawebapp.controller.command.category;

import jakarta.servlet.http.*;
import org.example.javawebapp.controller.command.Command;
import org.example.javawebapp.controller.utils.HttpWrapper;
import org.example.javawebapp.controller.utils.RedirectionManager;
import org.example.javawebapp.dao.jdbc.CategoryJDBCDao;
import org.example.javawebapp.entity.Category;

public class PostAddCategoryCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        System.out.println(req.getParameter("name"));
        CategoryJDBCDao categoryJDBCDao = new CategoryJDBCDao();
        categoryJDBCDao.create(new Category(0, req.getParameter("category-name")));

        RedirectionManager.redirect(new HttpWrapper(req, res), "/allCategories");
        return RedirectionManager.REDIRECTION;
    }
}

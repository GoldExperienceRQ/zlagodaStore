package org.example.javawebapp.controller.command.category;

import jakarta.servlet.http.*;
import org.example.javawebapp.constance.Page;
import org.example.javawebapp.controller.command.Command;
import org.example.javawebapp.controller.utils.HttpWrapper;
import org.example.javawebapp.controller.utils.RedirectionManager;
import org.example.javawebapp.dao.jdbc.CategoryJDBCDao;
import org.example.javawebapp.entity.Category;

public class DeleteCategoryCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        CategoryJDBCDao categoryJDBCDao = new CategoryJDBCDao();
        categoryJDBCDao.delete(new Category(Integer.parseInt(req.getParameter("category-id")), null));
        RedirectionManager.redirect(new HttpWrapper(req, res), "/allCategories");
        return RedirectionManager.REDIRECTION;
    }
}

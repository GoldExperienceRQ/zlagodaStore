package org.example.javawebapp.controller.command.category;

import jakarta.servlet.http.*;
import org.example.javawebapp.constance.Page;
import org.example.javawebapp.controller.command.Command;
import org.example.javawebapp.dao.jdbc.CategoryJDBCDao;

public class GetAllCategoriesCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        CategoryJDBCDao categoryJDBCDao = new CategoryJDBCDao();
        req.setAttribute("categories", categoryJDBCDao.getAll());
        return Page.ALL_CATEGORIES_VIEW;
    }
}

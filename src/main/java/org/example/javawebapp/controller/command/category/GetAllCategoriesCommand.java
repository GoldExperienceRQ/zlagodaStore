package org.example.javawebapp.controller.command.category;

import jakarta.servlet.http.*;
import org.example.javawebapp.constance.Page;
import org.example.javawebapp.controller.command.Command;

public class GetAllCategoriesCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        return Page.ALL_CATEGORIES_VIEW;
    }
}

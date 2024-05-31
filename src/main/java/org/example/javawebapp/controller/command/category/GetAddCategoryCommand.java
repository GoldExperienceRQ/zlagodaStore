package org.example.javawebapp.controller.command.category;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.javawebapp.constance.Page;
import org.example.javawebapp.controller.command.Command;

public class GetAddCategoryCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        return Page.ADD_CATEGORY_VIEW;
    }
}

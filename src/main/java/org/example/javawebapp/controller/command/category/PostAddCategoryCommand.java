package org.example.javawebapp.controller.command.category;

import jakarta.servlet.http.*;
import org.example.javawebapp.controller.command.Command;
import org.example.javawebapp.controller.utils.HttpWrapper;
import org.example.javawebapp.controller.utils.RedirectionManager;

public class PostAddCategoryCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        RedirectionManager.redirect(new HttpWrapper(req, res), "/allCategories");
        return RedirectionManager.REDIRECTION;
    }
}

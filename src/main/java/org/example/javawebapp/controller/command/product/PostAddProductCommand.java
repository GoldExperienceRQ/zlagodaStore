package org.example.javawebapp.controller.command.product;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.javawebapp.controller.command.Command;
import org.example.javawebapp.controller.utils.HttpWrapper;
import org.example.javawebapp.controller.utils.RedirectionManager;

public class PostAddProductCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        RedirectionManager.redirect(new HttpWrapper(req, res), "/allProducts");
        return RedirectionManager.REDIRECTION;
    }
}
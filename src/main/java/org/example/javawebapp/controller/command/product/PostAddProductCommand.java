package org.example.javawebapp.controller.command.product;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.javawebapp.controller.command.Command;

public class PostAddProductCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        return "";
    }
}

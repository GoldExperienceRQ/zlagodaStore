package org.example.javawebapp.controller.command.auth;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import org.example.javawebapp.controller.command.Command;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class LoginCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/views/Login.jsp");
        requestDispatcher.forward(req, res);
        return null;
    }
}

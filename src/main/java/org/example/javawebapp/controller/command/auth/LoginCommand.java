package org.example.javawebapp.controller.command.auth;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import org.example.javawebapp.constance.Page;
import org.example.javawebapp.controller.command.Command;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class LoginCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        return Page.LOGIN_VIEW;
    }
}

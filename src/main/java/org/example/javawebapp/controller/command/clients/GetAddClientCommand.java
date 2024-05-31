package org.example.javawebapp.controller.command.clients;

import jakarta.servlet.http.*;
import org.example.javawebapp.constance.Page;
import org.example.javawebapp.controller.command.Command;

public class GetAddClientCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        return Page.ADD_CLIENT_VIEW;
    }
}

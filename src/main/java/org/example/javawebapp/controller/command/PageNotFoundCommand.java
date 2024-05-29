package org.example.javawebapp.controller.command;

import jakarta.servlet.http.*;

public class PageNotFoundCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        return null;
    }
}

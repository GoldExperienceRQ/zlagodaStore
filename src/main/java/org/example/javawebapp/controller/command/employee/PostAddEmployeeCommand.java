package org.example.javawebapp.controller.command.employee;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.javawebapp.controller.command.Command;
import org.example.javawebapp.controller.utils.HttpWrapper;
import org.example.javawebapp.controller.utils.RedirectionManager;

public class PostAddEmployeeCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        RedirectionManager.redirect(new HttpWrapper(req, res), "/allEmployees");
        return RedirectionManager.REDIRECTION;
    }
}

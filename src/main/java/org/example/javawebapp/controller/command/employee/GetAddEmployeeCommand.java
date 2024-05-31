package org.example.javawebapp.controller.command.employee;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.javawebapp.constance.Page;
import org.example.javawebapp.controller.command.Command;

public class GetAddEmployeeCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        return Page.ADD_EMPLOYEE_VIEW;
    }
}

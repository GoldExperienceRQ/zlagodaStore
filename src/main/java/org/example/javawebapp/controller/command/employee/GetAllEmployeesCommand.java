package org.example.javawebapp.controller.command.employee;

import jakarta.servlet.http.*;
import org.example.javawebapp.controller.command.Command;
import org.example.javawebapp.constance.Page;
public class GetAllEmployeesCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {

        return Page.ALL_EMPLOYEES_VIEW;
    }
}

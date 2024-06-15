package org.example.javawebapp.controller.command.employee;

import jakarta.servlet.http.*;
import org.example.javawebapp.constance.Page;
import org.example.javawebapp.controller.command.Command;
import org.example.javawebapp.controller.utils.HttpWrapper;
import org.example.javawebapp.controller.utils.RedirectionManager;
import org.example.javawebapp.dao.jdbc.EmployeeJDBCDao;
import org.example.javawebapp.entity.Employee;

import javax.swing.text.View;

public class UpdateEmployeeCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        return null;
    }
}

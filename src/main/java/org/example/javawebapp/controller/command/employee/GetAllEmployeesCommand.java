package org.example.javawebapp.controller.command.employee;

import jakarta.servlet.http.*;
import org.example.javawebapp.controller.command.Command;
import org.example.javawebapp.constance.Page;
import org.example.javawebapp.dao.jdbc.EmployeeJDBCDao;

public class GetAllEmployeesCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        EmployeeJDBCDao employeeJDBCDao = new EmployeeJDBCDao();
        req.setAttribute("employees", employeeJDBCDao.getAll());
        return Page.ALL_EMPLOYEES_VIEW;
    }
}

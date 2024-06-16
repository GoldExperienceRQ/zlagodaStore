package org.example.javawebapp.controller.command.employee;

import jakarta.servlet.http.*;
import org.example.javawebapp.controller.command.Command;
import org.example.javawebapp.controller.utils.HttpWrapper;
import org.example.javawebapp.controller.utils.RedirectionManager;
import org.example.javawebapp.dao.jdbc.EmployeeJDBCDao;
import org.example.javawebapp.entity.Employee;

public class DeleteEmployeeCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        EmployeeJDBCDao employeeJDBCDao = new EmployeeJDBCDao();
        employeeJDBCDao.delete(new Employee(req.getParameter("employeeId")));
        RedirectionManager.redirect(new HttpWrapper(req, res), "/allEmployees");
        return RedirectionManager.REDIRECTION;
    }
}

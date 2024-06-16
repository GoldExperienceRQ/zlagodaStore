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

        EmployeeJDBCDao employeeJDBCDao = new EmployeeJDBCDao();
        employeeJDBCDao.update(new Employee(
                req.getParameter("id"),
                req.getParameter("name"),
                req.getParameter("surname"),
                req.getParameter("patronymic"),
                req.getParameter("role"),
                Integer.parseInt(req.getParameter("salary")),
                req.getParameter("dateOfStart"),
                req.getParameter("dateOfBirth"),
                req.getParameter("phone"),
                req.getParameter("city"),
                req.getParameter("street"),
                req.getParameter("index")
        ));
        RedirectionManager.redirect(new HttpWrapper(req, res), "/allEmployees");
        return RedirectionManager.REDIRECTION;
    }
}

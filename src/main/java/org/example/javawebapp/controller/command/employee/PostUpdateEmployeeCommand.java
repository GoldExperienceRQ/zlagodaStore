package org.example.javawebapp.controller.command.employee;

import jakarta.servlet.http.*;
import org.example.javawebapp.controller.command.Command;
import org.example.javawebapp.controller.utils.HttpWrapper;
import org.example.javawebapp.controller.utils.RedirectionManager;
import org.example.javawebapp.dao.jdbc.EmployeeJDBCDao;
import org.example.javawebapp.entity.Employee;

public class PostUpdateEmployeeCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        System.out.println("PostUpdateEmployeeCommand");
        EmployeeJDBCDao employeeJDBCDao = new EmployeeJDBCDao();
        System.out.println("EmployeeJDBCDao created");
        employeeJDBCDao.update(new Employee(
                req.getParameter("employeeId"),
                req.getParameter("name"),
                req.getParameter("surname"),
                req.getParameter("patronymic"),
                req.getParameter("role"),
                Double.parseDouble(req.getParameter("salary")),
                req.getParameter("dateOfStart"),
                req.getParameter("dateOfBirth"),
                req.getParameter("phone"),
                req.getParameter("city"),
                req.getParameter("street"),
                req.getParameter("index")
        ));
        System.out.println("Employee updated");
        RedirectionManager.redirect(new HttpWrapper(req, res), "/allEmployees");
        return RedirectionManager.REDIRECTION;
    }
}

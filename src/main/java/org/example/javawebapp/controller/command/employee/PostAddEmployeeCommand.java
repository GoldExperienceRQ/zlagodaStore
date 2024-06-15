package org.example.javawebapp.controller.command.employee;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.javawebapp.controller.command.Command;
import org.example.javawebapp.controller.utils.HttpWrapper;
import org.example.javawebapp.controller.utils.RedirectionManager;
import org.example.javawebapp.dao.jdbc.EmployeeJDBCDao;
import org.example.javawebapp.entity.Employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PostAddEmployeeCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        EmployeeJDBCDao employeeJDBCDao = new EmployeeJDBCDao();
        System.out.println("Adding employee");
        System.out.println(req.getParameter("dateOfStart"));
        System.out.println(req.getParameter("dateOfBirth"));
        employeeJDBCDao.create(new Employee(
                req.getParameter("employee_id"),
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
                req.getParameter("index")))
        ;
        RedirectionManager.redirect(new HttpWrapper(req, res), "/allEmployees");
        return RedirectionManager.REDIRECTION;
    }
}

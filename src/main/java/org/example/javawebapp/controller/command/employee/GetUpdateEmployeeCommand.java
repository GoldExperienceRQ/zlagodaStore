package org.example.javawebapp.controller.command.employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.javawebapp.constance.Page;
import org.example.javawebapp.controller.command.Command;
import org.example.javawebapp.dao.jdbc.EmployeeJDBCDao;
import org.example.javawebapp.entity.Employee;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class GetUpdateEmployeeCommand implements Command{
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) throws ExecutionException, ServletException, IOException {
        EmployeeJDBCDao employeeJDBCDao = new EmployeeJDBCDao();
        Employee currentEmployee = employeeJDBCDao.getById(req.getParameter("employeeId"));
        req.setAttribute("employee", currentEmployee);
        System.out.println(currentEmployee.getEmployeeId());
        System.out.println("Works");
        return Page.UPDATE_EMPLOYEE_VIEW;
    }
}

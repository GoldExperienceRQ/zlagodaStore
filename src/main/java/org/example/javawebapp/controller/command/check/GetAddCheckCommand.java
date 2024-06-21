package org.example.javawebapp.controller.command.check;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.javawebapp.constance.Page;
import org.example.javawebapp.controller.command.Command;
import org.example.javawebapp.dao.jdbc.ClientJDBCDao;
import org.example.javawebapp.dao.jdbc.EmployeeJDBCDao;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class GetAddCheckCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) throws ExecutionException, ServletException, IOException {

        ClientJDBCDao clientJDBCDao = new ClientJDBCDao();
        EmployeeJDBCDao employeeJDBCDao = new EmployeeJDBCDao();

        req.setAttribute("clients", clientJDBCDao.getAll());
        req.setAttribute("employees", employeeJDBCDao.getAll());

        return Page.ADD_CHECK_VIEW;
    }
}

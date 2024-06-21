package org.example.javawebapp.controller.command.check;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.javawebapp.constance.Page;
import org.example.javawebapp.controller.command.Command;
import org.example.javawebapp.dao.jdbc.CheckJDBCDao;
import org.example.javawebapp.dao.jdbc.ClientJDBCDao;
import org.example.javawebapp.dao.jdbc.EmployeeJDBCDao;
import org.example.javawebapp.entity.Check;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class GetUpdateCheckCommand implements Command {

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) throws ExecutionException, ServletException, IOException {

        ClientJDBCDao clientJDBCDao = new ClientJDBCDao();
        EmployeeJDBCDao employeeJDBCDao = new EmployeeJDBCDao();
        CheckJDBCDao checkJDBCDao = new CheckJDBCDao();
        Check currentCheck = checkJDBCDao.getByNumber(req.getParameter("checkNumber"));

        req.setAttribute("clients", clientJDBCDao.getAll());
        req.setAttribute("employees", employeeJDBCDao.getAll());
        req.setAttribute("check", currentCheck);
        System.out.println(currentCheck.getCheckNumber());
        return Page.UPDATE_CHECK_VIEW;
    }
}

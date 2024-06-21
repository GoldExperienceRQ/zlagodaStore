package org.example.javawebapp.controller.command.check;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.javawebapp.constance.Page;
import org.example.javawebapp.controller.command.Command;
import org.example.javawebapp.dao.jdbc.CheckJDBCDao;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class GetAllChecksCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) throws ExecutionException, ServletException, IOException {

        CheckJDBCDao checkJDBCDao = new CheckJDBCDao();

        req.setAttribute("checks", checkJDBCDao.getAll());

        return Page.ALL_CHECKS_VIEW;
    }
}

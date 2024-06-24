package org.example.javawebapp.controller.command.complexQueries;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.javawebapp.constance.Page;
import org.example.javawebapp.controller.command.Command;
import org.example.javawebapp.dao.jdbc.ComplexCommandJDBCDao;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class ComplexQueryTwoDimaCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) throws ExecutionException, ServletException, IOException {
        ComplexCommandJDBCDao complexCommandJDBCDao = new ComplexCommandJDBCDao();

        req.setAttribute("queryResult", complexCommandJDBCDao.complexCommandTwoDima());
        return Page.COMPLEX_QUERY_TWO_DIMA;

    }
}

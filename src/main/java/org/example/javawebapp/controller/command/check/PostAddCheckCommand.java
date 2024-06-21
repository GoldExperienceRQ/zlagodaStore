package org.example.javawebapp.controller.command.check;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.javawebapp.controller.command.Command;
import org.example.javawebapp.controller.utils.HttpWrapper;
import org.example.javawebapp.controller.utils.RedirectionManager;
import org.example.javawebapp.dao.jdbc.CheckJDBCDao;
import org.example.javawebapp.entity.Check;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class PostAddCheckCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) throws ExecutionException, ServletException, IOException {
        System.out.println("PostAddCheckCommand");
        CheckJDBCDao checkJDBCDao = new CheckJDBCDao();
        checkJDBCDao.create(new Check(
                req.getParameter("check-number"),
                req.getParameter("employee-id"),
                req.getParameter("client-id"),
                req.getParameter("print-date"),
                Double.parseDouble(req.getParameter("sum"))) )
        ;
        RedirectionManager.redirect(new HttpWrapper(req, res), "/allChecks");
        return RedirectionManager.REDIRECTION;
    }
}

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

public class DeleteCheckCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) throws ExecutionException, ServletException, IOException {

        CheckJDBCDao checkJDBCDao = new CheckJDBCDao();
        checkJDBCDao.delete(new Check(req.getParameter("checkNumber")));

        RedirectionManager.redirect(new HttpWrapper(req, res), "/allChecks");
        return RedirectionManager.REDIRECTION;
    }
}

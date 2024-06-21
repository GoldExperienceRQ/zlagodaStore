package org.example.javawebapp.controller.command.clients;

import jakarta.servlet.http.*;
import org.example.javawebapp.controller.command.Command;
import org.example.javawebapp.controller.utils.HttpWrapper;
import org.example.javawebapp.controller.utils.RedirectionManager;
import org.example.javawebapp.dao.jdbc.ClientJDBCDao;
import org.example.javawebapp.entity.Client;

public class PostUpdateClientCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        ClientJDBCDao clientJDBCDao = new ClientJDBCDao();
        clientJDBCDao.update(new Client(
                req.getParameter("clientNumber"),
                req.getParameter("name"),
                req.getParameter("surname"),
                req.getParameter("patronymic"),
                req.getParameter("city"),
                req.getParameter("street"),
                req.getParameter("index"),
                req.getParameter("phone"),
                Integer.parseInt(req.getParameter("percent"))));

        RedirectionManager.redirect(new HttpWrapper(req, res), "/allClients");
        return RedirectionManager.REDIRECTION;
    }
}

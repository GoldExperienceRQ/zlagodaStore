package org.example.javawebapp.controller.command.clients;

import jakarta.servlet.http.*;
import org.example.javawebapp.controller.command.Command;
import org.example.javawebapp.dao.jdbc.ClientJDBCDao;
import org.example.javawebapp.entity.Client;

public class UpdateClientCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        ClientJDBCDao clientJDBCDao = new ClientJDBCDao();
        clientJDBCDao.update(new Client(
                req.getParameter("client-number"),
                req.getParameter("client-name"),
                req.getParameter("client-surname"),
                req.getParameter("client-patronymic"),
                req.getParameter("client-city"),
                req.getParameter("client-street"),
                req.getParameter("client-index"),
                req.getParameter("client-phone"),
                Integer.parseInt(req.getParameter("client-percent"))));
        return null;
    }
}

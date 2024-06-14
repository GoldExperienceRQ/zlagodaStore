package org.example.javawebapp.controller.command.clients;

import jakarta.servlet.http.*;
import org.example.javawebapp.controller.command.Command;
import org.example.javawebapp.controller.utils.HttpWrapper;
import org.example.javawebapp.controller.utils.RedirectionManager;
import org.example.javawebapp.dao.jdbc.ClientJDBCDao;
import org.example.javawebapp.entity.Client;

public class DeleteClientCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        System.out.println(req.getParameter("client-number"));
        ClientJDBCDao clientJDBCDao = new ClientJDBCDao();
        clientJDBCDao.delete(new Client(req.getParameter("client-number")));
        RedirectionManager.redirect(new HttpWrapper(req, res), "/allClients");
        return RedirectionManager.REDIRECTION;
    }
}

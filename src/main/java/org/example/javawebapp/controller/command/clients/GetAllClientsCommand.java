package org.example.javawebapp.controller.command.clients;

import jakarta.servlet.http.*;
import org.example.javawebapp.constance.Page;
import org.example.javawebapp.controller.command.Command;
import org.example.javawebapp.dao.jdbc.ClientJDBCDao;

public class GetAllClientsCommand implements Command {

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        ClientJDBCDao clientJDBCDao = new ClientJDBCDao();
        req.setAttribute("clients", clientJDBCDao.getAll());
        return Page.GET_ALL_CLIENTS_VIEW;
    }
}

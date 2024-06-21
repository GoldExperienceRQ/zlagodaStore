package org.example.javawebapp.controller.command.clients;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.javawebapp.constance.Page;
import org.example.javawebapp.controller.command.Command;
import org.example.javawebapp.dao.jdbc.ClientJDBCDao;
import org.example.javawebapp.entity.Client;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class GetUpdateClientCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) throws ExecutionException, ServletException, IOException {

        ClientJDBCDao clientJDBCDao = new ClientJDBCDao();
        Client currentClient = clientJDBCDao.getByClientNumber(req.getParameter("clientNumber"));
        req.setAttribute("client", currentClient);

        return Page.UPDATE_CLIENT_VIEW;
    }
}

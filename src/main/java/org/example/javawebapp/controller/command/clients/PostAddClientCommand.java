package org.example.javawebapp.controller.command.clients;

import jakarta.servlet.http.*;
import org.example.javawebapp.constance.Page;
import org.example.javawebapp.controller.command.Command;
import org.example.javawebapp.controller.utils.HttpWrapper;
import org.example.javawebapp.controller.utils.RedirectionManager;

public class PostAddClientCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        RedirectionManager.redirect(new HttpWrapper(req, res), "/allClients");
        return RedirectionManager.REDIRECTION;
    }
}

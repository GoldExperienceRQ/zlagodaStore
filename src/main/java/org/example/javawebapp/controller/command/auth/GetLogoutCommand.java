package org.example.javawebapp.controller.command.auth;

import jakarta.servlet.http.*;
import org.example.javawebapp.constance.Page;
import org.example.javawebapp.controller.command.Command;
import org.example.javawebapp.controller.utils.HttpWrapper;
import org.example.javawebapp.controller.utils.RedirectionManager;

public class GetLogoutCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        HttpSession session = req.getSession();
        session.setAttribute("isLoggedIn", false);
        RedirectionManager.redirect(new HttpWrapper(req, res), "");
        return RedirectionManager.REDIRECTION;
    }
}

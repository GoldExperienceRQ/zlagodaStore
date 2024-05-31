package org.example.javawebapp.controller.command.product;

import jakarta.servlet.http.*;
import org.example.javawebapp.constance.Page;
import org.example.javawebapp.controller.command.Command;

public class GetAllProductsCommand implements Command {

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        return Page.ALL_PRODUCTS_VIEW;
    }
}

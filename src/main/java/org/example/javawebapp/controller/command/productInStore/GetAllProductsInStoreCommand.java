package org.example.javawebapp.controller.command.productInStore;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.javawebapp.constance.Page;
import org.example.javawebapp.controller.command.Command;

public class GetAllProductsInStoreCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        return Page.ALL_PRODUCTS_IN_STORE_VIEW;
    }
}

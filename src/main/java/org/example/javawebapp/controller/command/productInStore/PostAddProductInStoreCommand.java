package org.example.javawebapp.controller.command.productInStore;

import jakarta.servlet.http.*;
import org.example.javawebapp.controller.command.Command;
import org.example.javawebapp.controller.utils.*;

public class PostAddProductInStoreCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        RedirectionManager.redirect(new HttpWrapper(req, res), "/allProductsInStore");
        return RedirectionManager.REDIRECTION;
    }
}

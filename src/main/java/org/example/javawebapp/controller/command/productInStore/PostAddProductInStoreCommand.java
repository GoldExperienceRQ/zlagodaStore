package org.example.javawebapp.controller.command.productInStore;

import jakarta.servlet.http.*;
import org.example.javawebapp.controller.command.Command;
import org.example.javawebapp.controller.utils.*;
import org.example.javawebapp.dao.jdbc.ProductInStoreJDBCDao;
import org.example.javawebapp.dao.jdbc.ProductJDBCDao;
import org.example.javawebapp.entity.ProductInStore;

public class PostAddProductInStoreCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        ProductInStoreJDBCDao productInStoreJDBCDao = new ProductInStoreJDBCDao();
        boolean isPromotional = req.getParameter("is-promotional") != null;
        productInStoreJDBCDao.create(new ProductInStore(
                req.getParameter("upc"),
                Integer.parseInt(req.getParameter("id-product")),
                Double.parseDouble(req.getParameter("price")),
                Integer.parseInt(req.getParameter("quantity")),
                isPromotional
        ));
        RedirectionManager.redirect(new HttpWrapper(req, res), "/allProductsInStore");
        return RedirectionManager.REDIRECTION;
    }
}

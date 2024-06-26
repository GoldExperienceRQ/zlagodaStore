package org.example.javawebapp.controller.command.product;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.javawebapp.controller.command.Command;
import org.example.javawebapp.controller.utils.HttpWrapper;
import org.example.javawebapp.controller.utils.RedirectionManager;
import org.example.javawebapp.dao.jdbc.MySql;
import org.example.javawebapp.dao.jdbc.ProductJDBCDao;
import org.example.javawebapp.entity.Product;

public class PostAddProductCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {

        ProductJDBCDao productJDBCDao = new ProductJDBCDao();
        productJDBCDao.create(new Product(
                0,
                req.getParameter("product-name"),
                Integer.parseInt(req.getParameter("category")),
                req.getParameter("characteristics")
        ));

        RedirectionManager.redirect(new HttpWrapper(req, res), "/allProducts");
        return RedirectionManager.REDIRECTION;
    }
}

package org.example.javawebapp.controller.command.product;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.javawebapp.controller.command.Command;
import org.example.javawebapp.controller.utils.HttpWrapper;
import org.example.javawebapp.controller.utils.RedirectionManager;
import org.example.javawebapp.dao.jdbc.ProductJDBCDao;
import org.example.javawebapp.entity.Product;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class DeleteProductCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) throws ExecutionException, ServletException, IOException {
        ProductJDBCDao productJDBCDao = new ProductJDBCDao();
        productJDBCDao.delete(new Product(Integer.parseInt(req.getParameter("productId"))));
        RedirectionManager.redirect(new HttpWrapper(req, res), "/allProducts");
        return RedirectionManager.REDIRECTION;
    }
}

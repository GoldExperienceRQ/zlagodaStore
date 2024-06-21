package org.example.javawebapp.controller.command.productInStore;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.javawebapp.controller.command.Command;
import org.example.javawebapp.controller.utils.HttpWrapper;
import org.example.javawebapp.controller.utils.RedirectionManager;
import org.example.javawebapp.dao.jdbc.ProductInStoreJDBCDao;
import org.example.javawebapp.entity.ProductInStore;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class DeleteProductInStoreCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) throws ExecutionException, ServletException, IOException {

        ProductInStoreJDBCDao productInStoreJDBCDao = new ProductInStoreJDBCDao();
        productInStoreJDBCDao.delete(new ProductInStore(req.getParameter("upc")));

        RedirectionManager.redirect(new HttpWrapper(req, res), "/allProductsInStore");
        return RedirectionManager.REDIRECTION;
    }
}

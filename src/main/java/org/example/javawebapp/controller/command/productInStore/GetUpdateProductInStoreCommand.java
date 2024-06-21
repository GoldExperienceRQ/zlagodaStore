package org.example.javawebapp.controller.command.productInStore;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.javawebapp.constance.Page;
import org.example.javawebapp.controller.command.Command;
import org.example.javawebapp.dao.jdbc.ProductInStoreJDBCDao;
import org.example.javawebapp.dao.jdbc.ProductJDBCDao;
import org.example.javawebapp.entity.ProductInStore;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class GetUpdateProductInStoreCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) throws ExecutionException, ServletException, IOException {

        ProductInStoreJDBCDao productInStoreJDBCDao = new ProductInStoreJDBCDao();
        ProductJDBCDao productJDBCDao = new ProductJDBCDao();
        ProductInStore currentProductInStore = productInStoreJDBCDao.getByUpc(req.getParameter("upc"));
        System.out.println(currentProductInStore.getId());
        req.setAttribute("productInStore", currentProductInStore);
        req.setAttribute("products", productJDBCDao.getAll());

        return Page.UPDATE_PRODUCT_IN_STORE_VIEW;
    }
}

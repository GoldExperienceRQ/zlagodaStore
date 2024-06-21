package org.example.javawebapp.controller.command.productInStore;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.javawebapp.constance.Page;
import org.example.javawebapp.controller.command.Command;
import org.example.javawebapp.dao.jdbc.ProductJDBCDao;

public class GetAddProductInStoreCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        ProductJDBCDao productJDBCDao = new ProductJDBCDao();
        req.setAttribute("products", productJDBCDao.getAll());
        return Page.ADD_PRODUCT_IN_STORE_VIEW;
    }
}

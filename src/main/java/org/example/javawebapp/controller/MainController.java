package org.example.javawebapp.controller;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.example.javawebapp.controller.command.*;
import org.example.javawebapp.controller.utils.CommandKeyGenerator;
import org.example.javawebapp.controller.utils.HttpWrapper;
import org.example.javawebapp.controller.utils.RedirectionManager;


@WebServlet(name = "MainController", value = "/home/*")
public class MainController extends HttpServlet {


    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        processRequest(req, res);
    }
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        processRequest(req, res);
    }
    public void doDelete(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        processRequest(req, res);
    }
    private void processRequest(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        System.out.println("Processing request");
        String commandKey = CommandKeyGenerator.generateKey(req);
        System.out.println(commandKey);
        HttpWrapper httpWrapper = new HttpWrapper(req, res);
        Command command = CommandFactory.getCommand(commandKey);

        try{
            String commandResultedResource = command.execute(req, res);
            forwardToCommandResultedPage(httpWrapper, commandResultedResource);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    private void forwardToCommandResultedPage(HttpWrapper httpWrapper, String resultedRedirectResource)
            throws ServletException, IOException {
        if(!resultedRedirectResource.equals(RedirectionManager.REDIRECTION)) {
            System.out.println("resultedRedirectResource: " + resultedRedirectResource);
            httpWrapper.getRequest().getRequestDispatcher(resultedRedirectResource).forward(httpWrapper.getRequest(),
                    httpWrapper.getResponse());
        }
    }

}
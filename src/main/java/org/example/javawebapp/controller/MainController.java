package org.example.javawebapp.controller;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.example.javawebapp.controller.command.*;
import org.example.javawebapp.controller.utils.CommandKeyGenerator;


@WebServlet(name = "MainController", value = "/home/*")
public class MainController extends HttpServlet {


    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        System.out.println(req.getRequestURI());
        processRequest(req, res);
    }

    private void processRequest(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

        String commandKey = CommandKeyGenerator.generateKey(req);
        System.out.println(commandKey);
        Command command = CommandFactory.getCommand(commandKey);
        try{
            command.execute(req, res);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
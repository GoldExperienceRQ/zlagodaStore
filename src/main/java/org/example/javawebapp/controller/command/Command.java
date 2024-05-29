package org.example.javawebapp.controller.command;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public interface Command {
    String execute(HttpServletRequest req, HttpServletResponse res) throws ExecutionException, ServletException, IOException;
}

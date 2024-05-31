package org.example.javawebapp.controller.utils;

import jakarta.servlet.http.HttpServletRequest;
import org.example.javawebapp.exception.ServerException;

import java.io.IOException;


public class RedirectionManager {

    public static String REDIRECTION = "REDIRECTION";

    public static void redirect(HttpWrapper httpWrapper, String path) {
        try {
            httpWrapper.getResponse().sendRedirect(generateUrlPath(httpWrapper.getRequest(), path));
        } catch (IOException e) {
            throw new ServerException(e);
        }
    }

    private static String generateUrlPath(HttpServletRequest request, String path) {
        return new StringBuffer(request.getContextPath()).append(request.getServletPath()).append(path).toString();
    }
}

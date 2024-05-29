package org.example.javawebapp.controller.utils;

import jakarta.servlet.http.HttpServletRequest;

public final class CommandKeyGenerator {

    private static final String CONTROLLER_PATH = ".*/home/";
    private static final String REPLACEMENT = "";
    private static final String DELIMITER = ":";
    private CommandKeyGenerator() {
    }

    public static String generateKey(HttpServletRequest req) {
        String method = req.getMethod().toUpperCase();
        String path = req.getRequestURI().replaceAll(CONTROLLER_PATH, REPLACEMENT);
        return method + DELIMITER + path;
    }
}

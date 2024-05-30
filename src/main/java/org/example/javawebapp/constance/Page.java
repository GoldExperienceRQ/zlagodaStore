package org.example.javawebapp.constance;

public final class Page {

    public static final String PREFIX = "/WEB-INF/views/";
    public static final String ERROR_PREFIX = "errors";
    public static final String SUFFIX = ".jsp";

    private Page() {
    }

    public static final String LOGIN_VIEW = PREFIX + "login" + SUFFIX;

    public static final String ADD_PRODUCT_VIEW = PREFIX + "addProduct" + SUFFIX;

}

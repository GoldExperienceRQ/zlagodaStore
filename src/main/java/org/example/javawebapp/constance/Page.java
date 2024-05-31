package org.example.javawebapp.constance;

public final class Page {

    public static final String PREFIX = "/WEB-INF/views/";
    public static final String ERROR_PREFIX = "errors";
    public static final String SUFFIX = ".jsp";

    private Page() {
    }

    public static final String LOGIN_VIEW = PREFIX + "login" + SUFFIX;
    public static final String ALL_PRODUCTS_VIEW = PREFIX + "allProducts" + SUFFIX;
    public static final String ADD_PRODUCT_VIEW = PREFIX + "addProduct" + SUFFIX;
    public static final String GET_ALL_CLIENTS_VIEW = PREFIX + "allClients" + SUFFIX;
    public static final String ADD_CLIENT_VIEW = PREFIX  + "addClient" + SUFFIX;
    public static final String ALL_CATEGORIES_VIEW = PREFIX + "allCategories" + SUFFIX;
    public static final String ADD_CATEGORY_VIEW = PREFIX + "addCategory" + SUFFIX;
    public static final String ADD_EMPLOYEE_VIEW = PREFIX + "addEmployee" + SUFFIX;
    public static final String ALL_EMPLOYEES_VIEW = PREFIX + "allEmployees" + SUFFIX;
    public static final String ALL_PRODUCTS_IN_STORE_VIEW = PREFIX + "allProductsInStore" + SUFFIX;
    public static final String ADD_PRODUCT_IN_STORE_VIEW = PREFIX + "addProductInStore" + SUFFIX;
}

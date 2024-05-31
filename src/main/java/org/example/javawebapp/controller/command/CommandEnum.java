package org.example.javawebapp.controller.command;

import org.example.javawebapp.controller.command.auth.GetLogoutCommand;
import org.example.javawebapp.controller.command.auth.LoginCommand;
import org.example.javawebapp.controller.command.auth.PostLoginCommand;
import org.example.javawebapp.controller.command.category.*;
import org.example.javawebapp.controller.command.clients.*;
import org.example.javawebapp.controller.command.employee.*;
import org.example.javawebapp.controller.command.product.*;
import org.example.javawebapp.controller.command.productInStore.*;

public enum CommandEnum {
    PAGE_NOT_FOUND {
        {
            this.key = "GET:pageNotFound";
            this.command = new PageNotFoundCommand();
        }
    },
    GET_ALL_PRODUCTS_IN_STORE {
        {
            this.key = "GET:allProductsInStore";
            this.command = new GetAllProductsInStoreCommand();
        }
    },
    GET_ADD_PRODUCT_IN_STORE {
        {
            this.key = "GET:allProductsInStore/addProductInStore";
            this.command = new GetAddProductInStoreCommand();
        }
    },
    POST_ADD_PRODUCT_IN_STORE {
        {
            this.key = "POST:allProductsInStore/addProductInStore";
            this.command = new PostAddProductInStoreCommand();
        }
    },
    GET_ALL_EMPLOYEES {
        {
            this.key = "GET:allEmployees";
            this.command = new GetAllEmployeesCommand();
        }
    },
    GET_ADD_EMPLOYEE {
        {
            this.key = "GET:allEmployees/addEmployee";
            this.command = new GetAddEmployeeCommand();
        }
    },
    POST_ADD_EMPLOYEE {
        {
            this.key = "POST:allEmployees/addEmployee";
            this.command = new PostAddEmployeeCommand();
        }
    },
    GET_ALL_CATEGORIES {
        {
            this.key = "GET:allCategories";
            this.command = new GetAllCategoriesCommand();
        }
    },
    GET_ADD_CATEGORY {
        {
            this.key = "GET:allCategories/addCategory";
            this.command = new GetAddCategoryCommand();
        }
    },
    POST_ADD_CATEGORY {
        {
            this.key = "POST:allCategories/addCategory";
            this.command = new PostAddCategoryCommand();
        }
    },
    GET_ADD_PRODUCT {
        {
            this.key = "GET:allProducts/addProduct";
            this.command = new GetAddProductCommand();
        }
    },
    POST_ADD_PRODUCT {
        {
            this.key = "POST:allProducts/addProduct";
            this.command = new PostAddProductCommand();
        }
    },
    GET_LOGOUT {
        {
            this.key = "GET:logout";
            this.command = new GetLogoutCommand();
        }
    },
    POST_LOGIN {
        {
            this.key = "POST:login";
            this.command = new PostLoginCommand();
        }
    },
    GET_LOGIN {
        {
            this.key = "GET:login";
            this.command = new LoginCommand();
        }
    },
    GET_ALL_PRODUCTS {
        {
            this.key = "GET:allProducts";
            this.command = new GetAllProductsCommand();
        }
    },
    GET_ADD_CLIENT {
        {
            this.key = "GET:allClients/addClient";
            this.command = new GetAddClientCommand();
        }
    },
    POST_ADD_CLIENT {
        {
            this.key = "POST:allClients/addClient";
            this.command = new PostAddClientCommand();
        }
    },
    GET_ALL_CLIENTS{
        {
            this.key = "GET:allClients";
            this.command = new GetAllClientsCommand();
        }
    };
    Command command;
    String key;
    private Command getCommand() {
        return command;
    }
    public static Command getCommand(String commandKey) {
        for(CommandEnum command: CommandEnum.values()){
            if(command.key.equals(commandKey)){
                return command.getCommand();
            }
        }
        return null;
    }
}

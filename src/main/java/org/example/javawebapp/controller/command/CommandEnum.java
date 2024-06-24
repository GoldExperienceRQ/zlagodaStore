package org.example.javawebapp.controller.command;

import org.example.javawebapp.controller.command.auth.GetLogoutCommand;
import org.example.javawebapp.controller.command.auth.LoginCommand;
import org.example.javawebapp.controller.command.auth.PostLoginCommand;
import org.example.javawebapp.controller.command.category.*;
import org.example.javawebapp.controller.command.check.*;
import org.example.javawebapp.controller.command.clients.*;
import org.example.javawebapp.controller.command.complexQueries.*;
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
    GET_ALL_CHECKS {
        {
            this.key = "GET:allChecks";
            this.command = new GetAllChecksCommand();
        }
    },
    GET_ADD_CHECK {
        {
            this.key = "GET:allChecks/addCheck";
            this.command = new GetAddCheckCommand();
        }
    },
    POST_ADD_CHECK {
        {
            this.key = "POST:allChecks/addCheck";
            this.command = new PostAddCheckCommand();
        }
    },
    DELETE_CHECK {
        {
            this.key = "POST:allChecks/deleteCheck";
            this.command = new DeleteCheckCommand();
        }
    },
    GET_UPDATE_CHECK {
        {
            this.key = "GET:allChecks/updateCheck";
            this.command = new GetUpdateCheckCommand();
        }
    },
    POST_UPDATE_CHECK{
        {
            this.key = "POST:allChecks/updateCheck";
            this.command = new PostUpdateCheckCommand();
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
    DELETE_PRODUCT_IN_STORE {
        {
            this.key = "POST:allProductsInStore/deleteProductInStore";
            this.command = new DeleteProductInStoreCommand();
        }
    },
    GET_UPDATE_PRODUCT_IN_STORE {
        {
            this.key = "GET:allProductsInStore/updateProductInStore";
            this.command = new GetUpdateProductInStoreCommand();
        }
    },
    POST_UPDATE_PRODUCT_IN_STORE {
        {
            this.key = "POST:allProductsInStore/updateProductInStore";
            this.command = new PostUpdateProductInStoreCommand();
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
    GET_UPDATE_EMPLOYEE {
        {
            this.key = "GET:allEmployees/updateEmployee";
            this.command = new GetUpdateEmployeeCommand();
        }
    },
    POST_UPDATE_EMPLOYEE {
        {
            this.key = "POST:allEmployees/updateEmployee";
            this.command = new PostUpdateEmployeeCommand();
        }
    },
    DELETE_EMPLOYEE {
        {
            this.key = "POST:allEmployees/deleteEmployee";
            this.command = new DeleteEmployeeCommand();
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
    GET_UPDATE_CATEGORY {
        {
            this.key = "GET:allCategories/updateCategory";
            this.command = new GetUpdateCategoryCommand();
        }
    },
    POST_UPDATE_CATEGORY {
        {
            this.key = "POST:allCategories/updateCategory";
            this.command = new PostUpdateCategoryCommand();
        }
    },
    POST_ADD_CATEGORY {
        {
            this.key = "POST:allCategories/addCategory";
            this.command = new PostAddCategoryCommand();
        }
    },
    DELETE_CATEGORY {
        {
            this.key = "POST:allCategories/deleteCategory";
            this.command = new DeleteCategoryCommand();
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
    DELETE_PRODUCT {
        {
            this.key = "POST:allProducts/deleteProduct";
            this.command = new DeleteProductCommand();
        }
    },
    GET_UPDATE_PRODUCT {
        {
            this.key = "GET:allProducts/updateProduct";
            this.command = new GetUpdateProductCommand();
        }
    },
    POST_UPDATE_PRODUCT {
        {
            this.key = "POST:allProducts/updateProduct";
            this.command = new PostUpdateProductCommand();
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
    },
    DELETE_CLIENT {
        {
            this.key = "POST:allClients/deleteClient";
            this.command = new DeleteClientCommand();
        }
    },
    POST_UPDATE_CLIENT {
        {
            this.key = "POST:allClients/updateClient";
            this.command = new PostUpdateClientCommand();
        }
    },
    GET_UPDATE_CLIENT {
        {
            this.key = "GET:allClients/updateClient";
            this.command = new GetUpdateClientCommand();
        }
    },
    COMPLEX_QUERY_ONE_DIMA{
        {
            this.key = "GET:complexQueryOneDima";
            this.command = new ComplexQueryOneDimaCommand();
        }
    },
    COMPLEX_QUERY_ONE_TWO_DIMA{
        {
            this.key = "GET:complexQueryTwoDima";
            this.command = new ComplexQueryTwoDimaCommand();
        }
    },
    COMPLEX_QUERY_ONE_VLADA{
        {
            this.key = "GET:complexQueryOneVlada";
            this.command = new ComplexQueryOneVladaCommand();
        }
    },
    COMPLEX_QUERY_TWO_VLADA{
        {
            this.key = "GET:complexQueryTwoVlada";
            this.command = new ComplexQueryTwoVladaCommand();
        }
    },
    COMPLEX_QUERY_ONE{
        {
            this.key = "GET:complexQueryOne";
            this.command = new ComplexQueryOneCommand();
        }
    },
    COMPLEX_QUERY_TWO{
        {
            this.key = "GET:complexQueryTwo";
            this.command = new ComplexQueryTwoCommand();
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

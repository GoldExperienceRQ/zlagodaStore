package org.example.javawebapp.controller.command;

import org.example.javawebapp.controller.command.auth.LoginCommand;
import org.example.javawebapp.controller.command.product.*;

public enum CommandEnum {
    PAGE_NOT_FOUND {
        {
            this.key = "GET:pageNotFound";
            this.command = new PageNotFoundCommand();
        }
    },
    GET_ADD_PRODUCT {
        {
            this.key = "POST:addProduct";
            this.command = new GetAddProductCommand();
        }
    },
    POST_ADD_PRODUCT {
        {
            this.key = "GET:product";
            this.command = new PostAddProductCommand();
        }
    },
    GET_LOGIN {
        {
            this.key = "GET:login";
            this.command = new LoginCommand();

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

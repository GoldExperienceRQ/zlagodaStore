package org.example.javawebapp.controller.command;

import org.example.javawebapp.controller.command.auth.LoginCommand;

public enum CommandEnum {
    PAGE_NOT_FOUND {
        {
            this.key = "GET:pageNotFound";
            this.command = new PageNotFoundCommand();
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

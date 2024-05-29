package org.example.javawebapp.controller.command;

public class CommandFactory {
    private CommandFactory() {
    }

    public static Command getCommand(String commandKey) {
        Command command = CommandEnum.getCommand(commandKey);
        return command;
    }
}

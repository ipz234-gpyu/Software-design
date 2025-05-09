package com.education.ztu.Composite.Command;

import java.util.Stack;

public class CommandInvoker {
    private final Stack<LightCommand> history = new Stack<>();

    public void executeCommand(LightCommand command) {
        command.execute();
        history.push(command);
    }

    public void undoLastCommand() {
        if (!history.isEmpty()) {
            LightCommand lastCommand = history.pop();
            lastCommand.undo();
        }
    }
}
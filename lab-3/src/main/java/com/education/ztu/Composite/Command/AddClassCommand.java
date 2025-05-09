package com.education.ztu.Composite.Command;

import com.education.ztu.Composite.LightElementNode;

public class AddClassCommand extends LightCommand {
    private final String className;

    public AddClassCommand(LightElementNode targetNode, String className) {
        super(targetNode);
        this.className = className;
    }

    @Override
    public void execute() {
        ((LightElementNode) targetNode).addClass(className);
        System.out.println("Class " + className + " added.");
    }

    @Override
    public void undo() {
        ((LightElementNode) targetNode).removeClass(className);
        System.out.println("Class " + className + " removed.");
    }
}
package com.education.ztu.Composite.Command;

import com.education.ztu.Composite.LightElementNode;
import com.education.ztu.Composite.LightNode;

public class AppendChildCommand extends LightCommand {
    private final LightNode childNode;

    public AppendChildCommand(LightNode targetNode, LightNode childNode) {
        super(targetNode);
        this.childNode = childNode;
    }

    @Override
    public void execute() {
        ((LightElementNode) targetNode).appendChild(childNode);
        System.out.println("Child node appended.");
    }

    @Override
    public void undo() {
        ((LightElementNode) targetNode).removeChild(childNode);
        System.out.println("Child node removed.");
    }
}
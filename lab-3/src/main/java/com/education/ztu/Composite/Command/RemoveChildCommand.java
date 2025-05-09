package com.education.ztu.Composite.Command;

import com.education.ztu.Composite.LightElementNode;
import com.education.ztu.Composite.LightNode;

public class RemoveChildCommand extends LightCommand {
    private final LightNode childNode;

    public RemoveChildCommand(LightNode targetNode, LightNode childNode) {
        super(targetNode);
        this.childNode = childNode;
    }

    @Override
    public void execute() {
        ((LightElementNode) targetNode).removeChild(childNode);
        System.out.println("Child node removed.");
    }

    @Override
    public void undo() {
        ((LightElementNode) targetNode).appendChild(childNode);
        System.out.println("Child node appended back.");
    }
}
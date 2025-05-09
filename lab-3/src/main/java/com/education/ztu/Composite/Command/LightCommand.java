package com.education.ztu.Composite.Command;

import com.education.ztu.Composite.LightNode;

public abstract class LightCommand {
    protected LightNode targetNode;

    public LightCommand(LightNode targetNode) {
        this.targetNode = targetNode;
    }

    public abstract void execute();
    public abstract void undo();
}
package com.education.ztu.Composite.State;

import com.education.ztu.Composite.LightNode;

public class CreatedState implements RenderState {
    @Override
    public void handle(LightNode context) {
        context.onCreated();
        context.setState(new InsertedState());
    }
}
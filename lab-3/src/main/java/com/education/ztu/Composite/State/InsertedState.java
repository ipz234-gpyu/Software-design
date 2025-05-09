package com.education.ztu.Composite.State;

import com.education.ztu.Composite.LightNode;

public class InsertedState implements RenderState {
    @Override
    public void handle(LightNode context) {
        context.onInserted();
        context.setState(new StylesAppliedState());
    }
}
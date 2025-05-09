package com.education.ztu.Composite.State;

import com.education.ztu.Composite.LightNode;

public class StylesAppliedState implements RenderState {
    @Override
    public void handle(LightNode context) {
        context.onStylesApplied();
        context.setState(new ClassListAppliedState());
    }
}
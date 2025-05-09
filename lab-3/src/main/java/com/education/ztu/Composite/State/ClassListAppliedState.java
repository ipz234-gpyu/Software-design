package com.education.ztu.Composite.State;

import com.education.ztu.Composite.LightNode;

public class ClassListAppliedState implements RenderState {
    @Override
    public void handle(LightNode context) {
        context.onClassListApplied();
        context.setState(new TextRenderedState());
    }
}

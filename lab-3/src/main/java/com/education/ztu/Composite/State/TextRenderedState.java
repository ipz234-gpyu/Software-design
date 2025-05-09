package com.education.ztu.Composite.State;

import com.education.ztu.Composite.LightNode;

public class TextRenderedState implements RenderState {
    @Override
    public void handle(LightNode context) {
        context.onTextRendered();
    }
}
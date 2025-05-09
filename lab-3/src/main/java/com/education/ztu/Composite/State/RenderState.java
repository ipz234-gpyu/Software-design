package com.education.ztu.Composite.State;

import com.education.ztu.Composite.LightNode;

public interface RenderState {
    void handle(LightNode context);
}
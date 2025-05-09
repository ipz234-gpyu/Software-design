package com.education.ztu.Composite;

import com.education.ztu.Composite.State.CreatedState;
import com.education.ztu.Composite.State.RenderState;
import com.education.ztu.Composite.State.TextRenderedState;

public abstract class LightNode {
    protected boolean created = false;
    protected boolean inserted = false;
    protected boolean stylesApplied = false;
    protected boolean classListApplied = false;
    protected boolean textRendered = false;

    private RenderState state = new CreatedState();

    public void setState(RenderState state) {
        this.state = state;
    }

    public void renderWithState() {
        while (!(state instanceof TextRenderedState)) {
            state.handle(this);
        }
    }

    public abstract String outerHTML();
    public abstract String innerHTML();

    public final String renderWithLifecycle() {
        onCreated();
        onInserted();
        onStylesApplied();
        onClassListApplied();
        onTextRendered();
        return outerHTML();
    }

    public void onCreated() {
        created = true;
        System.out.println(getNodeType() + " created.");
    }

    public void onInserted() {
        inserted = true;
        System.out.println(getNodeType() + " inserted into DOM.");
    }

    public void onStylesApplied() {
        stylesApplied = true;
        System.out.println("Styles applied to " + getNodeType() + ".");
    }

    public void onClassListApplied() {
        classListApplied = true;
        System.out.println("Class list applied to " + getNodeType() + ".");
    }

    public void onTextRendered() {
        textRendered = true;
        System.out.println("Text rendered in " + getNodeType() + ": " + innerHTML());
    }

    public abstract String getNodeType();
}
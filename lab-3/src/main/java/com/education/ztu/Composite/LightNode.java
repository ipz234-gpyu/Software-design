package com.education.ztu.Composite;

public abstract class LightNode {
    protected boolean created = false;
    protected boolean inserted = false;
    protected boolean stylesApplied = false;
    protected boolean classListApplied = false;
    protected boolean textRendered = false;

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

    protected void onCreated() {
        created = true;
        System.out.println(getNodeType() + " created.");
    }

    protected void onInserted() {
        inserted = true;
        System.out.println(getNodeType() + " inserted into DOM.");
    }

    protected void onStylesApplied() {
        stylesApplied = true;
        System.out.println("Styles applied to " + getNodeType() + ".");
    }

    protected void onClassListApplied() {
        classListApplied = true;
        System.out.println("Class list applied to " + getNodeType() + ".");
    }

    protected void onTextRendered() {
        textRendered = true;
        System.out.println("Text rendered in " + getNodeType() + ": " + innerHTML());
    }

    protected abstract String getNodeType();
}
package com.education.ztu.Composite;

public class LightTextNode extends LightNode {
    private final String text;

    public LightTextNode(String text) {
        this.text = text;
    }

    @Override
    public String outerHTML() {
        return text;
    }

    @Override
    public String innerHTML() {
        return text;
    }

    @Override
    public void onStylesApplied() {
        stylesApplied = true;
        System.out.println("No styles applicable to text node.");
    }

    @Override
    public void onClassListApplied() {
        classListApplied = true;
        System.out.println("No class list for text node.");
    }

    @Override
    public String getNodeType() {
        return "TextNode";
    }
}
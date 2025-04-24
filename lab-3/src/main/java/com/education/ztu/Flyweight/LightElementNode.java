package com.education.ztu.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class LightElementNode extends LightNode {
    private final LightElementNodeType type;
    private final List<String> cssClasses = new ArrayList<>();
    private final List<LightNode> children = new ArrayList<>();

    public LightElementNode(LightElementNodeType type) {
        this.type = type;
    }

    public void addClass(String className) {
        cssClasses.add(className);
    }

    public void appendChild(LightNode child) {
        if (type.getClosingType() == LightElementNodeType.ClosingType.SINGLE) {
            throw new UnsupportedOperationException("Single tags can't have children.");
        }
        children.add(child);
    }

    @Override
    public String innerHTML() {
        StringBuilder sb = new StringBuilder();
        for (LightNode child : children) {
            sb.append(child.outerHTML());
        }
        return sb.toString();
    }

    @Override
    public String outerHTML() {
        StringBuilder html = new StringBuilder();
        html.append("<").append(type.getTagName());
        if (!cssClasses.isEmpty()) {
            html.append(" class=\"").append(String.join(" ", cssClasses)).append("\"");
        }

        if (type.getClosingType() == LightElementNodeType.ClosingType.SINGLE) {
            html.append("/>");
        } else {
            html.append(">").append(innerHTML()).append("</").append(type.getTagName()).append(">");
        }
        return html.toString();
    }
}
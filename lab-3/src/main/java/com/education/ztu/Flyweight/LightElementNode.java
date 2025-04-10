package com.education.ztu.Flyweight;

import java.util.ArrayList;
import java.util.List;

class LightElementNode extends LightNode {
    private final String tagName;
    private final DisplayType displayType;
    private final ClosingType closingType;
    private final List<String> cssClasses;
    private final List<LightNode> children = new ArrayList<>();

    public LightElementNode(String tagName, DisplayType displayType, ClosingType closingType, List<String> cssClasses) {
        this.tagName = tagName;
        this.displayType = displayType;
        this.closingType = closingType;
        this.cssClasses = cssClasses;
    }

    public void addChild(LightNode node) {
        children.add(node);
    }

    public List<LightNode> getChildren() {
        return children;
    }

    @Override
    public String outerHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(tagName);
        if (!cssClasses.isEmpty()) {
            sb.append(" class=\"").append(String.join(" ", cssClasses)).append("\"");
        }
        if (closingType == ClosingType.SINGLE) {
            sb.append("/>");
        } else {
            sb.append(">");
            for (LightNode child : children) {
                sb.append(child.outerHTML());
            }
            sb.append("</").append(tagName).append(">");
        }
        return sb.toString();
    }

    @Override
    public String innerHTML() {
        StringBuilder sb = new StringBuilder();
        for (LightNode child : children) {
            sb.append(child.outerHTML());
        }
        return sb.toString();
    }
}
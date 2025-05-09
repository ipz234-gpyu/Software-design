package com.education.ztu.Composite;

import com.education.ztu.Composite.Visitor.Visitor;

import java.util.*;

public class LightElementNode extends LightNode implements IterableCollection {
    public enum DisplayType { BLOCK, INLINE }
    public enum ClosingType { SINGLE, PAIR }

    private final String tagName;
    private final DisplayType displayType;
    private final ClosingType closingType;
    private final List<String> cssClasses = new ArrayList<>();
    private final List<LightNode> children = new ArrayList<>();

    public LightElementNode(String tagName, DisplayType displayType, ClosingType closingType) {
        this.tagName = tagName;
        this.displayType = displayType;
        this.closingType = closingType;
    }

    public void addClass(String className) {
        cssClasses.add(className);
    }

    public void removeClass(String className) {
        cssClasses.remove(className);
    }

    public void appendChild(LightNode child) {
        if (closingType == ClosingType.SINGLE) {
            throw new UnsupportedOperationException("Single tags can't have children.");
        }
        children.add(child);
    }

    public void removeChild(LightNode child) {
        children.remove(child);
    }

    public int getChildrenCount() {
        return children.size();
    }

    private String renderAttributes() {
        if (cssClasses.isEmpty()) return "";
        return " class=\"" + String.join(" ", cssClasses) + "\"";
    }

    @Override
    public LightNodeIterator getIterator(TraversalType type) {
        return switch (type) {
            case DEPTH -> new DepthFirstIterator(this);
            case BREADTH -> new BreadthFirstIterator(this);
        };
    }

    public List<LightNode> getChildren() {
        return children;
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
        String attrs = renderAttributes();
        if (closingType == ClosingType.SINGLE) {
            return "<" + tagName + attrs + "/>";
        }

        return "<" + tagName + attrs + ">" + innerHTML() + "</" + tagName + ">";
    }

    @Override
    public void onClassListApplied() {
        classListApplied = true;
        System.out.println("Class list applied: " + String.join(" ", cssClasses));
    }

    @Override
    public String getNodeType() {
        return "Element <" + tagName + ">";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (LightNode child : children) {
            child.accept(visitor);
        }
    }
}
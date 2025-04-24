package com.education.ztu.Flyweight;

public class LightElementNodeType {
    private final String tagName;
    private final DisplayType displayType;
    private final ClosingType closingType;

    public enum DisplayType { BLOCK, INLINE }
    public enum ClosingType { PAIR, SINGLE }

    public LightElementNodeType(String tagName, DisplayType displayType, ClosingType closingType) {
        this.tagName = tagName;
        this.displayType = displayType;
        this.closingType = closingType;
    }

    public String getTagName() {
        return tagName;
    }

    public DisplayType getDisplayType() {
        return displayType;
    }

    public ClosingType getClosingType() {
        return closingType;
    }
}
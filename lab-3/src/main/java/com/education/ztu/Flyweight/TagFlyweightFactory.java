package com.education.ztu.Flyweight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TagFlyweightFactory {
    private static final Map<String, LightElementNode> cache = new HashMap<>();

    public static LightElementNode getTag(String tagName, DisplayType displayType, ClosingType closingType, List<String> cssClasses) {
        String key = tagName + displayType + closingType + String.join("-", cssClasses);
        if (!cache.containsKey(key)) {
            cache.put(key, new LightElementNode(tagName, displayType, closingType, cssClasses));
        }
        return new LightElementNode(tagName, displayType, closingType, cssClasses);
    }
}
package com.education.ztu.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class LightElementNodeTypeFactory {
    private final Map<String, LightElementNodeType> cache = new HashMap<>();

    public LightElementNodeType getType(String tagName, LightElementNodeType.DisplayType displayType, LightElementNodeType.ClosingType closingType) {
        String key = tagName + ":" + displayType + ":" + closingType;
        return cache.computeIfAbsent(key, k -> new LightElementNodeType(tagName, displayType, closingType));
    }

    public int getCachedTypesCount() {
        return cache.size();
    }
}
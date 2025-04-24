package com.education.ztu.Flyweight;

public class BookParser {
    private final LightElementNodeTypeFactory typeFactory = new LightElementNodeTypeFactory();

    public LightElementNode parseText(String text) {
        LightElementNodeType divType = typeFactory.getType("div", LightElementNodeType.DisplayType.BLOCK, LightElementNodeType.ClosingType.PAIR);
        LightElementNode container = new LightElementNode(divType);
        container.addClass("book");

        String[] lines = text.split("\\r?\\n");
        for (int i = 0; i < lines.length; i++) {
            String line = lines[i].trim();
            String original = lines[i];

            if (line.isEmpty()) continue;

            String tag;
            if (i == 0) {
                tag = "h1";
            } else if (line.length() < 20) {
                tag = "h2";
            } else if (original.startsWith(" ")) {
                tag = "blockquote";
            } else {
                tag = "p";
            }

            LightElementNodeType type = typeFactory.getType(tag, LightElementNodeType.DisplayType.BLOCK, LightElementNodeType.ClosingType.PAIR);
            LightElementNode node = new LightElementNode(type);
            node.appendChild(new LightTextNode(line));

            container.appendChild(node);
        }

        return container;
    }

    public int getCachedTypesCount() {
        return typeFactory.getCachedTypesCount();
    }
}
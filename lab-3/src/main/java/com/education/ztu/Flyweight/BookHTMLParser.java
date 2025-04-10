package com.education.ztu.Flyweight;

import java.util.List;

class BookHTMLParser {
    public static LightElementNode parseBook(List<String> lines) {
        LightElementNode root = new LightElementNode("div", DisplayType.BLOCK, ClosingType.PAIR, List.of("book"));

        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            String tag;
            if (i == 0) tag = "h1";
            else if (line.length() < 20) tag = "h2";
            else if (line.startsWith(" ")) tag = "blockquote";
            else tag = "p";

            LightElementNode element = TagFlyweightFactory.getTag(tag, DisplayType.BLOCK, ClosingType.PAIR, List.of());
            element.addChild(new LightTextNode(line));
            root.addChild(element);
        }

        return root;
    }
}
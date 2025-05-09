package com.education.ztu.Composite;

public class Demo {
    public static void main(String[] args) {
        LightElementNode div = new LightElementNode("div", LightElementNode.DisplayType.BLOCK, LightElementNode.ClosingType.PAIR);
        div.addClass("container");

        LightElementNode ul = new LightElementNode("ul", LightElementNode.DisplayType.BLOCK, LightElementNode.ClosingType.PAIR);
        ul.addClass("list");

        for (int i = 1; i <= 3; i++) {
            LightElementNode li = new LightElementNode("li", LightElementNode.DisplayType.BLOCK, LightElementNode.ClosingType.PAIR);
            li.appendChild(new LightTextNode("Item " + i));
            ul.appendChild(li);
        }

        div.appendChild(ul);
        System.out.println(div.outerHTML());

        div.renderWithLifecycle();

        LightNodeIterator dfs = div.getIterator(TraversalType.DEPTH);
        while (dfs.hasNext()) {
            LightNode node = dfs.next();
            System.out.println(node.outerHTML());
        }
    }
}
package com.education.ztu.Composite;

import com.education.ztu.Composite.Command.*;
import com.education.ztu.Composite.Visitor.NodeCountingVisitor;

public class Demo {
    public static void main(String[] args) {
        LightElementNode div = new LightElementNode("div", LightElementNode.DisplayType.BLOCK, LightElementNode.ClosingType.PAIR);
        div.addClass("container");

        LightImageNode localImage = new LightImageNode("images/logo.png");
        LightImageNode networkImage = new LightImageNode("https://example.com/image.jpg");

        div.appendChild(localImage);
        div.appendChild(networkImage);

        System.out.println(div.outerHTML());

        div.renderWithState();

        LightNodeIterator dfs = div.getIterator(TraversalType.DEPTH);
        while (dfs.hasNext()) {
            LightNode node = dfs.next();
            System.out.println(node.outerHTML());
        }

        CommandInvoker invoker = new CommandInvoker();

        LightCommand addClassCommand = new AddClassCommand(div, "my-class");
        invoker.executeCommand(addClassCommand);

        System.out.println(div.outerHTML());
        invoker.undoLastCommand();
        System.out.println(div.outerHTML());

        NodeCountingVisitor visitor = new NodeCountingVisitor();

        div.accept(visitor);

        System.out.println("Elements: " + visitor.getElementCount());
        System.out.println("Text nodes: " + visitor.getTextCount());
    }
}
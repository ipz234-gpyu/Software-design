package com.education.ztu.Composite;

public class Demo {
    public static void main(String[] args) {
        LightElementNode div = new LightElementNode("div", LightElementNode.DisplayType.BLOCK, LightElementNode.ClosingType.PAIR);
        div.addClass("container");

        LightElementNode button = new LightElementNode("button", LightElementNode.DisplayType.INLINE, LightElementNode.ClosingType.PAIR);
        button.appendChild(new LightTextNode("Click Me"));

        button.addEventListener("click", (eventType, source) -> {
            System.out.println("Button was clicked! Source tag: <" + source.outerHTML() + ">");
        });

        button.addEventListener("mouseover", (eventType, source) -> {
            System.out.println("Mouse is over the button! Tag: <" + source.outerHTML() + ">");
        });

        div.appendChild(button);

        System.out.println(div.outerHTML());

        button.triggerEvent("click");
        button.triggerEvent("mouseover");
    }
}
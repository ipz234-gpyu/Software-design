package com.education.ztu.Composite;

public class Demo {
    public static void main(String[] args) {
        LightElementNode div = new LightElementNode("div", LightElementNode.DisplayType.BLOCK, LightElementNode.ClosingType.PAIR);
        div.addClass("container");

        LightImageNode localImage = new LightImageNode("images/logo.png");
        LightImageNode networkImage = new LightImageNode("https://example.com/image.jpg");

        div.appendChild(localImage);
        div.appendChild(networkImage);

        System.out.println(div.outerHTML());
    }
}
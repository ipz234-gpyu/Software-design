package com.education.ztu.Composite;

public class LightImageNode extends LightNode {
    private String src;
    private ImageLoadingStrategy strategy;

    public LightImageNode(String src) {
        this.src = src;
        this.strategy = chooseStrategy(src); // автоматичний вибір
    }

    private ImageLoadingStrategy chooseStrategy(String href) {
        if (href.startsWith("http://") || href.startsWith("https://")) {
            return new NetworkImageLoader();
        } else {
            return new FileSystemImageLoader();
        }
    }

    public void setSrc(String newSrc) {
        this.src = newSrc;
        this.strategy = chooseStrategy(newSrc); // автоматична зміна стратегії
    }

    @Override
    public String innerHTML() {
        return "";
    }

    @Override
    public String outerHTML() {
        return "<img src=\"" + src + "\" alt=\"" + strategy.load(src) + "\"/>";
    }
}

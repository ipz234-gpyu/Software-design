package com.education.ztu.Bridge;

public class VectorRenderer implements Renderer {
    @Override
    public String render(String shape) {
        return "Drawing " + shape + " as lines";
    }
}
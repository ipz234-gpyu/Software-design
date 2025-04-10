package com.education.ztu.Bridge;

public class RasterRenderer implements Renderer {
    @Override
    public String render(String shape) {
        return "Drawing " + shape + " as pixels";
    }
}
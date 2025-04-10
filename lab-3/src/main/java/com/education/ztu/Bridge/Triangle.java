package com.education.ztu.Bridge;

public class Triangle extends Shape {
    public Triangle(Renderer renderer) {
        super(renderer);
    }

    @Override
    public String draw() {
        return renderer.render("Triangle");
    }
}
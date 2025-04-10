package com.education.ztu.Bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
    @Test
    void testCircleWithVectorRenderer() {
        Shape circle = new Circle(new VectorRenderer());
        assertEquals("Drawing Circle as lines", circle.draw());
    }

    @Test
    void testSquareWithRasterRenderer() {
        Shape square = new Square(new RasterRenderer());
        assertEquals("Drawing Square as pixels", square.draw());
    }

    @Test
    void testTriangleWithVectorRenderer() {
        Shape triangle = new Triangle(new VectorRenderer());
        assertEquals("Drawing Triangle as lines", triangle.draw());
    }

    @Test
    void testTriangleWithRasterRenderer() {
        Shape triangle = new Triangle(new RasterRenderer());
        assertEquals("Drawing Triangle as pixels", triangle.draw());
    }
}
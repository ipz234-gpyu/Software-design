package com.education.ztu.Flyweight;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> bookLines = List.of(
                "The Great Adventure",
                "Chapter 1",
                "  It was a bright cold day in April, and the clocks were striking thirteen.",
                "This is a regular paragraph with more than 20 characters.",
                "Another paragraph with enough length."
        );

        LightElementNode htmlTree = BookHTMLParser.parseBook(bookLines);

        System.out.println("Generated HTML:");
        System.out.println(htmlTree.outerHTML());

        int nodeCount = countNodes(htmlTree);
        System.out.printf("\nTotal nodes in memory: %d\nEstimated memory usage: ~%d bytes\n", nodeCount, nodeCount * 64);
    }

    private static int countNodes(LightNode node) {
        if (node instanceof LightTextNode) return 1;
        if (node instanceof LightElementNode) {
            int sum = 1;
            for (LightNode child : ((LightElementNode) node).getChildren()) {
                sum += countNodes(child);
            }
            return sum;
        }
        return 0;
    }
}
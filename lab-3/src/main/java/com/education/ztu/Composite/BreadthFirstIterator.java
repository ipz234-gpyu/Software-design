package com.education.ztu.Composite;

import java.util.*;

public class BreadthFirstIterator implements LightNodeIterator {
    private final Queue<LightNode> queue = new LinkedList<>();

    public BreadthFirstIterator(LightNode root) {
        queue.add(root);
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    @Override
    public LightNode next() {
        LightNode current = queue.poll();
        if (current instanceof LightElementNode element) {
            queue.addAll(element.getChildren());
        }
        return current;
    }
}
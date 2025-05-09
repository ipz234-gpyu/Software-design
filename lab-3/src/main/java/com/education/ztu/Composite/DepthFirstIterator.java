package com.education.ztu.Composite;

import java.util.*;

public class DepthFirstIterator implements LightNodeIterator {
    private final Deque<LightNode> stack = new ArrayDeque<>();

    public DepthFirstIterator(LightNode root) {
        stack.push(root);
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public LightNode next() {
        LightNode current = stack.pop();
        if (current instanceof LightElementNode element) {
            List<LightNode> children = element.getChildren();
            ListIterator<LightNode> it = children.listIterator(children.size());
            while (it.hasPrevious()) {
                stack.push(it.previous());
            }
        }
        return current;
    }
}
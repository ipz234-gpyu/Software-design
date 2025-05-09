package com.education.ztu.Composite;

public interface IterableCollection {
    LightNodeIterator getIterator(TraversalType type);
}
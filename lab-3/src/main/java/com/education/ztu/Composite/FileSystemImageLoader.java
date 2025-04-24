package com.education.ztu.Composite;

public class FileSystemImageLoader implements ImageLoadingStrategy {
    @Override
    public String load(String src) {
        return "[Image loaded from file: " + src + "]";
    }
}
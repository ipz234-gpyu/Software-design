package com.education.ztu.Composite;

public class NetworkImageLoader implements ImageLoadingStrategy {
    @Override
    public String load(String src) {
        return "[Image loaded from network: " + src + "]";
    }
}
package com.education.ztu.Composite;

public class ImageStrategyFactory {
    public static ImageLoadingStrategy chooseStrategy(String src) {
        if (src.startsWith("http://") || src.startsWith("https://")) {
            return new NetworkImageLoader();
        } else {
            return new FileSystemImageLoader();
        }
    }
}
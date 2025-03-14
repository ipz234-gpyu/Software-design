package com.education.ztu.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Virus implements Cloneable {
    private String name;
    private String type;
    private double weight;
    private int age;
    private List<Virus> children;

    public Virus(String name, String type, double weight, int age) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.age = age;
        this.children = new ArrayList<>();
    }

    public void addChild(Virus child) {
        children.add(child);
    }

    @Override
    protected Virus clone() {
        try {
            Virus cloned = (Virus) super.clone();
            cloned.children = new ArrayList<>();
            for (Virus child : this.children) {
                cloned.children.add(child.clone());
            }
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone not supported", e);
        }
    }

    public void printInfo(String prefix) {
        System.out.println(prefix + "🦠 " + name + " (" + type + "), вага: " + weight + ", вік: " + age);
        for (Virus child : children) {
            child.printInfo(prefix + "   ");
        }
    }
}
package com.education.ztu.Prototype;

public class TestPrototype {
    public static void main(String[] args) {
        Virus parentVirus = new Virus("COVID-19", "Коронавірус", 0.5, 2);

        Virus child1 = new Virus("Delta", "Мутація", 0.4, 1);
        Virus child2 = new Virus("Omicron", "Мутація", 0.3, 1);
        parentVirus.addChild(child1);
        parentVirus.addChild(child2);

        child1.addChild(new Virus("Delta Plus", "Підмутація", 0.35, 0));
        child2.addChild(new Virus("Omicron BA.2", "Підмутація", 0.25, 0));

        System.out.println("Оригінальне сімейство вірусів:");
        parentVirus.printInfo("");

        Virus clonedVirus = parentVirus.clone();

        System.out.println("\nКлоноване сімейство вірусів:");
        clonedVirus.printInfo("");
    }
}

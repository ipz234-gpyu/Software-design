package com.education.ztu.Builder;

public class Character {
    private String name;
    private String race;
    private String characterClass;
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private String equipment;

    public Character(String name, String race, String characterClass, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, String equipment) {
        this.name = name;
        this.race = race;
        this.characterClass = characterClass;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return "🧝‍♂️ Персонаж: " + name + "\n" +
                "🔹 Раса: " + race + "\n" +
                "⚔️ Клас: " + characterClass + "\n" +
                "💪 Сила (STR): " + strength + "\n" +
                "🏃‍♂️ Спритність (DEX): " + dexterity + "\n" +
                "❤️ Витривалість (CON): " + constitution + "\n" +
                "🧠 Інтелект (INT): " + intelligence + "\n" +
                "🦉 Мудрість (WIS): " + wisdom + "\n" +
                "🎭 Харизма (CHA): " + charisma + "\n" +
                "🛡️ Обладнання: " + equipment + "\n";
    }
}


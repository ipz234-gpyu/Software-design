package com.education.ztu.Builder;

public class HeroBuilder implements CharacterBuilder {
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

    @Override
    public HeroBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public HeroBuilder setRace(String race) {
        this.race = race;
        return this;
    }

    @Override
    public HeroBuilder setClass(String characterClass) {
        this.characterClass = characterClass;
        return this;
    }

    @Override
    public HeroBuilder setStrength(int strength) {
        this.strength = strength;
        return this;
    }

    @Override
    public HeroBuilder setDexterity(int dexterity) {
        this.dexterity = dexterity;
        return this;
    }

    @Override
    public HeroBuilder setConstitution(int constitution) {
        this.constitution = constitution;
        return this;
    }

    @Override
    public HeroBuilder setIntelligence(int intelligence) {
        this.intelligence = intelligence;
        return this;
    }

    @Override
    public HeroBuilder setWisdom(int wisdom) {
        this.wisdom = wisdom;
        return this;
    }

    @Override
    public HeroBuilder setCharisma(int charisma) {
        this.charisma = charisma;
        return this;
    }

    @Override
    public HeroBuilder setEquipment(String equipment) {
        this.equipment = equipment;
        return this;
    }

    @Override
    public Character build() {
        return new Character(name, race, characterClass, strength, dexterity, constitution, intelligence, wisdom, charisma, equipment);
    }
}
package com.education.ztu.Builder;

public class EnemyBuilder implements CharacterBuilder {
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
    private String evilDeeds;

    public EnemyBuilder addEvilDeed(String deed) {
        if (evilDeeds == null) {
            evilDeeds = deed;
        } else {
            evilDeeds += ", " + deed;
        }
        return this;
    }

    @Override
    public EnemyBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public EnemyBuilder setRace(String race) {
        this.race = race;
        return this;
    }

    @Override
    public EnemyBuilder setClass(String characterClass) {
        this.characterClass = characterClass;
        return this;
    }

    @Override
    public EnemyBuilder setStrength(int strength) {
        this.strength = strength;
        return this;
    }

    @Override
    public EnemyBuilder setDexterity(int dexterity) {
        this.dexterity = dexterity;
        return this;
    }

    @Override
    public EnemyBuilder setConstitution(int constitution) {
        this.constitution = constitution;
        return this;
    }

    @Override
    public EnemyBuilder setIntelligence(int intelligence) {
        this.intelligence = intelligence;
        return this;
    }

    @Override
    public EnemyBuilder setWisdom(int wisdom) {
        this.wisdom = wisdom;
        return this;
    }

    @Override
    public EnemyBuilder setCharisma(int charisma) {
        this.charisma = charisma;
        return this;
    }

    @Override
    public EnemyBuilder setEquipment(String equipment) {
        this.equipment = equipment;
        return this;
    }

    @Override
    public Character build() {
        return new Character(name, race, characterClass, strength, dexterity, constitution, intelligence, wisdom, charisma, equipment + " 🩸 (Злі діяння: " + evilDeeds + ")");
    }
}
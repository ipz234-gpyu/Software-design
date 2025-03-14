package com.education.ztu.Builder;

public interface CharacterBuilder {
    CharacterBuilder setName(String name);
    CharacterBuilder setRace(String race);
    CharacterBuilder setClass(String characterClass);
    CharacterBuilder setStrength(int strength);
    CharacterBuilder setDexterity(int dexterity);
    CharacterBuilder setConstitution(int constitution);
    CharacterBuilder setIntelligence(int intelligence);
    CharacterBuilder setWisdom(int wisdom);
    CharacterBuilder setCharisma(int charisma);
    CharacterBuilder setEquipment(String equipment);
    Character build();
}

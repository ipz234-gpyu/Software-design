package com.education.ztu.Builder;

public class CharacterDirector {
    //Персонажі з нашої днд гри)
    public Character createNecromancer() {
        return new HeroBuilder()
                .setName("Валансі")
                .setRace("Ельф")
                .setClass("Некромант")
                .setStrength(14)
                .setDexterity(12)
                .setConstitution(16)
                .setIntelligence(10)
                .setWisdom(14)
                .setCharisma(18)
                .setEquipment("Мантія, Золота табуретка, Книга некромантії")
                .build();
    }

    public Character createLich() {
        return new EnemyBuilder()
                .setName("НекрОфіл")
                .setRace("Нежить")
                .setClass("Некромант")
                .setStrength(8)
                .setDexterity(10)
                .setConstitution(12)
                .setIntelligence(20)
                .setWisdom(16)
                .setCharisma(14)
                .setEquipment("Темний посох, Книга некромантії")
                .addEvilDeed("Прокляв ціле місто")
                .addEvilDeed("Закликав армію нежиті")
                .build();
    }

    public Character constructCharacter(CharacterBuilder builder) {
        return builder
                .setStrength(10)
                .setDexterity(10)
                .setConstitution(10)
                .setIntelligence(10)
                .setWisdom(10)
                .setCharisma(10)
                .build();
    }
}

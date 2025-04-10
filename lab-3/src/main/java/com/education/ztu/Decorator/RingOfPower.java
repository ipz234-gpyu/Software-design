package com.education.ztu.Decorator;

public class RingOfPower extends HeroDecorator {
    public RingOfPower(Hero hero) {
        super(hero);
    }

    @Override
    public String getDescription() {
        return decoratedHero.getDescription() + " wearing Ring of Power";
    }

    @Override
    public int getAttack() {
        return decoratedHero.getAttack() + 3;
    }

    @Override
    public int getDefense() {
        return decoratedHero.getDefense() + 2;
    }
}
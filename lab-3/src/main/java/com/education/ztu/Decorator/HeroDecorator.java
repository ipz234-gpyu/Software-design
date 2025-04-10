package com.education.ztu.Decorator;

public abstract class HeroDecorator implements Hero {
    protected Hero decoratedHero;

    public HeroDecorator(Hero hero) {
        this.decoratedHero = hero;
    }

    @Override
    public String getDescription() {
        return decoratedHero.getDescription();
    }

    @Override
    public int getAttack() {
        return decoratedHero.getAttack();
    }

    @Override
    public int getDefense() {
        return decoratedHero.getDefense();
    }
}
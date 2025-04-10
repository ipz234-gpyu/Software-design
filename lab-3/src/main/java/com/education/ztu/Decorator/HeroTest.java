package com.education.ztu.Decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {

    @Test
    void testWarriorBaseStats() {
        Hero warrior = new Warrior();
        assertEquals("Warrior", warrior.getDescription());
        assertEquals(10, warrior.getAttack());
        assertEquals(5, warrior.getDefense());
    }

    @Test
    void testMageWithRingOfPower() {
        Hero mage = new RingOfPower(new Mage());
        assertEquals("Mage wearing Ring of Power", mage.getDescription());
        assertEquals(15, mage.getAttack()); // 12 + 3
        assertEquals(4, mage.getDefense()); // 2 + 2
    }

    @Test
    void testPaladinFullyEquipped() {
        Hero paladin = new Paladin();
        Hero equipped = new Sword(new Armor(new RingOfPower(paladin)));

        assertTrue(equipped.getDescription().contains("Paladin"));
        assertTrue(equipped.getDescription().contains("Sword"));
        assertTrue(equipped.getDescription().contains("Armor"));
        assertTrue(equipped.getDescription().contains("Ring"));

        assertEquals(16, equipped.getAttack()); // 8 + 3 + 5
        assertEquals(17, equipped.getDefense()); // 8 + 2 + 7
    }

    @Test
    void testDoubleSwordStacking() {
        Hero warrior = new Sword(new Sword(new Warrior()));
        assertEquals(20, warrior.getAttack()); // 10 + 5 + 5
        assertEquals(5, warrior.getDefense());
    }
}
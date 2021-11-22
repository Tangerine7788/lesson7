package com.company.Heroes;

import com.company.Others.AbilityType;
import com.company.Boss.Boss;

public class Warrior extends Hero {
    public Warrior(int health, int damage) {
        super(health, damage, AbilityType.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {

    }
}

package com.company.Heroes;

import com.company.Others.AbilityType;
import com.company.Boss.Boss;

public class Magical extends Hero {
    public Magical(int health, int damage) {
        super(health, damage, AbilityType.BOOST);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {

    }
}

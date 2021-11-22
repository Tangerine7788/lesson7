package com.company.Heroes;

import com.company.Others.AbilityType;
import com.company.Boss.Boss;

public class Hunter extends Hero {
    public Hunter(int health, int damage) {
        super(health, damage, AbilityType.CRITICAL_DAMAGE);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {

    }
}

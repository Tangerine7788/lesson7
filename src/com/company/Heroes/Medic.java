package com.company.Heroes;

import com.company.Others.AbilityType;
import com.company.Boss.Boss;

public class Medic extends Hero {
    public Medic(int health, int damage){
        super(health, damage, AbilityType.HEAL);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {

    }
}

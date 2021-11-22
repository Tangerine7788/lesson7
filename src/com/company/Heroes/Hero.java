package com.company.Heroes;

import com.company.Others.AbilityType;
import com.company.Others.GameEntity;
import com.company.IAbilityType;

public abstract class Hero extends GameEntity implements IAbilityType {
    private AbilityType ability;


    public Hero(int health, int damage, AbilityType ability) {
        super(health, damage);
        this.ability = ability;
    }
}



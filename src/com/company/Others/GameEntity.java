package com.company.Others;

public abstract class GameEntity {
    protected int health;
    protected  int damage;

    public GameEntity(int health, int damage) {
        this.health = health;
        this.damage = damage;
        }


    public int putDamage(int damage){
      this.health=health-damage;
      return this.health;
    }

    public int getHealth() {
        return health;
        }




    public int getDamage() {
        return damage;
        }



    public void setHealth(int health) {


        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

}

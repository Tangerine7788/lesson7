package com.company.Others;

import com.company.Boss.Boss;
import com.company.Heroes.*;

public class RpgGame {
    private static void printStatistics(Hero heroes[], Boss boss){
        System.out.println("------------------");
        System.out.println("Boss health: " + boss.getHealth());
        for (Hero hero : heroes) {
            System.out.println("Hero " + hero.getClass().getSimpleName()
                    + " current health: " + hero.getHealth());
        }
        System.out.println("------------------");
    }

    private static void heroesHits(Hero heroes[], Boss boss){
        for (Hero hero : heroes){
            int heroDamage = hero.getDamage();
            boss.putDamage(heroDamage);
            System.out.println("Hero " + hero.getClass().getSimpleName()
                    + " attack Boss: " + heroDamage);
        }
        if (boss.getHealth() <= 0){
            boss.setHealth(0);
        }
    }

    private static void bossHits(Hero heroes[], Boss boss){
        for (Hero hero : heroes){
            int bossDamage = boss.getDamage();
            hero.putDamage(bossDamage);
            System.out.println("Boss attack hero " + hero.getClass().getSimpleName()
                    + ": " + bossDamage);
        }
    }

    private static boolean isFinish(Hero heroes[], Boss boss){
        if (boss.getHealth() <= 0){
            System.out.println("Heroes Won!!!");
            return true;
        }

        boolean allHeroesDead = true;
        for (Hero hero : heroes){
            if (hero.getHealth() > 0){
                allHeroesDead = false;
                break;
            }
        }

        if (allHeroesDead){
            System.out.println("Boss Won!!!");
        }

        return allHeroesDead;
    }

    private static void applyAbility(Hero heroes[], Boss boss){
        for (Hero hero : heroes){
            hero.useAbility(heroes, boss);
        }
    }

    private static Hero[] createHeroes(){
        Hero heroes[] = new Hero[4];
        heroes[0] = new Hunter(300, 30);
        heroes[1] = new Magical(250, 25);
        heroes[2] = new Medic(250, 0);
        heroes[3] = new Warrior(300, 30);
        return heroes;
    }

    private static void round(Hero heroes[], Boss boss){

        // Нанесение урона боссом
        bossHits(heroes, boss);

        // Нанесение урона героями
        heroesHits(heroes, boss);

        // Применение суперспособностей
        applyAbility(heroes, boss);

        // Распечатка статистики
        printStatistics(heroes, boss);
    }

    public static void startGame(){
        Hero[] heroes = createHeroes();
        Boss boss = new Boss(500, 30);
        printStatistics(heroes, boss);
        while (!isFinish(heroes, boss)){
            round(heroes, boss);
        }
    }
}

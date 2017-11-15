package week5.gladiator;

import week5.gladiator.fighters.Gladiator;
import week5.gladiator.util.Random;
import week5.gladiator.weapons.Blade;
import week5.gladiator.weapons.Bow;
import week5.gladiator.weapons.Knife;
import week5.gladiator.weapons.Weapon;

public final class Colosseum {

    private final Gladiator firstFighter;
    private final Gladiator secondFighter;
    private final Weapon[] weapons = new Weapon[]{new Bow(), new Knife(),
            new Blade("Name", 30)};

    public Colosseum(Gladiator firstFighter, Gladiator secondFighter) {
        this.firstFighter = firstFighter;
        this.secondFighter = secondFighter;
    }

    public void fight(){

        while (firstFighter.isAlive() && secondFighter.isAlive()) {

            int limit = weapons.length;
            Weapon weaponForFirstFighter = weapons[Random.gen(limit)];
            Weapon weaponForSecondFighter = weapons[Random.gen(limit)];

            firstFighter.dropWeapon();
            secondFighter.dropWeapon();

            firstFighter.takeWeapon(weaponForFirstFighter);
            secondFighter.takeWeapon(weaponForSecondFighter);

            int firstDamage = firstFighter.bit();
            System.out.printf("%s did damage - %d, using - %s\n", firstFighter.getName(), firstDamage, weaponForFirstFighter.getName());
            secondFighter.defence(firstDamage);

            int secondDamage = secondFighter.bit();
            System.out.printf("%s did damage - %d, using - %s\n", secondFighter.getName(), secondDamage, weaponForSecondFighter.getName());
            firstFighter.defence(secondDamage);

            System.out.printf("%s has health - %d\n", firstFighter.getName(), firstFighter.getHealth());
            System.out.printf("%s has health - %d\n", secondFighter.getName(), secondFighter.getHealth());

        }

        if(!firstFighter.isAlive() && !secondFighter.isAlive()) {
            System.out.println("Draw");
        } else if(!firstFighter.isAlive()) {
            System.out.println("Win - " + secondFighter.getName());
        } else {
            System.out.println("Win - " + firstFighter.getName());
        }

    }


}

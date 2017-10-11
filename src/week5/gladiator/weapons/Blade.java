package week5.gladiator.weapons;

import week5.gladiator.util.Random;

public class Blade implements Weapon {

    private String NAME = "BLADE";
    private int power = 30;

    public Blade() {
    }

    public Blade(String name, int power) {
        this.NAME = name;
        this.power = power;
    }

    @Override
    public int bit(int strength, int mentality) {
        return power + (Random.gen(strength * 2)) + (Random.gen(mentality / 2));
    }

    @Override
    public String getName() {
        return NAME;
    }

}

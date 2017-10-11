package week5.gladiator.weapons;

import week5.gladiator.util.Random;

public class Bow implements Weapon {

    private static final String NAME = "BOW";
    private static final int power = 20;

    @Override
    public int bit(int strength, int mentality) {
        return power + (Random.gen(strength / 2)) + (Random.gen(mentality * 2));
    }

    @Override
    public String getName() {
        return NAME;
    }
}

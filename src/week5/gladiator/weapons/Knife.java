package week5.gladiator.weapons;

import week5.gladiator.util.Random;

public class Knife implements Weapon {

    private static final String NAME = "KNIFE";
    private static final int POWER = 10;

    @Override
    public int bit(int strength, int mentality) {
        return POWER + (Random.gen(strength)) + (Random.gen(mentality));
    }

    @Override
    public String getName() {
        return NAME;
    }

}

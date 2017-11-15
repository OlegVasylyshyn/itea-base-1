package week5.gladiator.fighters;

import week5.gladiator.util.Random;
import week5.gladiator.weapons.Weapon;

public abstract class Gladiator {

    private String name;
    protected int health;
    protected int strength;
    protected int adroitness;
    protected int mentality;

    protected Weapon weapon;

    public Gladiator(String name, int health, int strength,
                     int adroitness, int mentality) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.adroitness = adroitness;
        this.mentality = mentality;
    }

    public int bit() {
        if(weapon != null) return weapon.bit(strength, mentality);
        return strength;
    }

    public void defence(int damage) {
        if(adroitness <= Random.gen(100)) {
            health -= damage;
        }
    }

    public boolean isAlive() {
        return health > 0;
    }

    public Weapon dropWeapon() {
        Weapon dropped = weapon;
        weapon = null;
        return dropped;
    }

    public void takeWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
}

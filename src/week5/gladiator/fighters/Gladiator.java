package week5.gladiator;

public abstract class Gladiator {

    protected String name;

    protected int health;
    protected int strength;
    protected int adroitness;
    protected int mentality;

    protected Weapon weapon;


    public int bit(){

        return -1;
    }

    public boolean isAlive() {
        return health > 0;
    }

    

}

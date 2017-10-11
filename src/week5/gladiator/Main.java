package week5.gladiator;

import week5.gladiator.fighters.Gladiator;

public class Main {

    public static void main(String[] args) {
        Colosseum colosseum = new Colosseum(
                new Gladiator("SuperMan", 500, 80,
                        5, 5) {},
                new Gladiator("BatMan", 150, 20,
                        60, 80) {}
        );
        colosseum.fight();
    }

}

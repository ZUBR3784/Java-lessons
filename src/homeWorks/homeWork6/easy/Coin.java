package homeWorks.homeWork6.easy;

import java.util.Random;

public class Coin {
    public static void main(String[] args) {
        Random rand = new Random();
        boolean eagleOrTails = rand.nextBoolean();
        if (eagleOrTails) {
            System.out.println("Eagle");
        } else {
            System.out.println("Tails");
        }
    }

}

package klasswork;

import java.util.Random;

public class RaitingChecker {

    public void check(int raiting) {
        if (raiting > 86) {
            System.out.println(5);
        } else if (raiting > 72) {
            System.out.println(4);
        } else if (raiting > 56) {
            System.out.println(3);
        } else {
            System.out.println(2);
        }
    }

    public static void main(String[] args) {
        RaitingChecker raitingChecker = new RaitingChecker();
        Random random = new Random();
        int raiting = random.nextInt(86) +48;
        System.out.println(random.nextDouble());
        raitingChecker.check(raiting);
    }
}

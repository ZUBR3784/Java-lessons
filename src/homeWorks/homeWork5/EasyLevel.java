package homeWorks.homeWork5;

import java.util.Scanner;

public class EasyLevel {
    public static void main(String[] args) {

        boolean isWeekend = true;
        boolean isRain = false;
        boolean canWalk = isWeekend && !isRain;
        System.out.println(canWalk);

        boolean isEdekaOpen =true;
        boolean isReweOpen =false;
        boolean canBuy = isReweOpen || isEdekaOpen;
        System.out.println("I cab buy food: " + canBuy);

        Scanner scan =new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println(dividedFor7And5(x));

        Scanner string = new Scanner(System.in);
        String str = string.next();
        System.out.println(searchString(str));


    }

    static boolean dividedFor7And5(int x){
        return x % 7 == 0 && x % 5 == 0;
    }
    static boolean searchString(String str){
        return str.length() > 10;
    }


}

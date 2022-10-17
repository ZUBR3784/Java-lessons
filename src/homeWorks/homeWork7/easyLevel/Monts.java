package homeWorks.homeWork7.easyLevel;

import java.util.Random;

public class Monts {
    public static void main(String[] args) {
        Random x = new Random();
        int num = x.nextInt(12) +1;
        System.out.println(num);
        switch (num){
            case 12, 1, 2:
                System.out.println("зима");
                break;
            case 3, 4, 5:
                System.out.println("весна");
                break;
            case 6, 7, 8:
                System.out.println("лето");
                break;
            case 9, 10, 11:
                System.out.println("осень");
                break;
        }

    }
}
//В переменной month лежит какое-то число из интервала от 1 до 12.
// Определите в какую пору года попадает этот месяц (зима, лето, весна, осень).
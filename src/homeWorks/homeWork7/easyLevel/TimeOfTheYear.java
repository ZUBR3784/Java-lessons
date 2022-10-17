package homeWorks.homeWork7.easyLevel;

import java.util.Random;

public class TimeOfTheYear {
    public static void main(String[] args) {
        Random x = new Random();
        int num = x.nextInt(3) +1;
        System.out.println(num);
        switch (num){
            case 1:
                System.out.println("зима");
                break;
            case 2:
                System.out.println("весна");
                break;
            case 3:
                System.out.println("лето");
                break;
            case 4:
                System.out.println("осень");
                break;
        }
    }
}
// Переменная num может принимать 4 значения: 1, 2, 3 или 4. Если она имеет значение '1',
// то в переменную result запишем 'зима', если имеет значение '2' – 'весна' и так далее.
// Решите задачу через switch-case.
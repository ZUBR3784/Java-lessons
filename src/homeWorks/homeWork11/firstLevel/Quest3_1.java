package homeWorks.homeWork11.firstLevel;

import java.util.Arrays;
import java.util.Random;

public class Quest3_1 {
    public static void main(String[] args) {
        int size =100;
        int maxNum =10;
        int[] arr = new int[size];
        Random random =new Random();
        for (int i = 0; i <size ; i++) {
            arr[i] = random.nextInt(maxNum);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i] * 2;
        }System.out.println(Arrays.toString(arr));
    }
}
//Создайте массив А[1..100] с помощью генератора случайных чисел и выведите его на экран. Увеличьте все его элементы в 2 раза.

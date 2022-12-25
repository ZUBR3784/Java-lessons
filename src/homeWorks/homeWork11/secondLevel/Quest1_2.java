package homeWorks.homeWork11.secondLevel;

import java.util.Arrays;
import java.util.Random;

public class Quest1_2 {
    public static void main(String[] args) {
        Random random = new Random();
        int max= 0;
        int[] newMassiv = new int[10];
        int[] dividedMassiv = new int[10];
        for (int i = 0; i <newMassiv.length; i++) {
            newMassiv[i]= Math.abs(random.nextInt());
            System.out.println(newMassiv[i]);
            if (max<newMassiv[i]){
                max=newMassiv[i];
            }
        }
        System.out.println("Максимальный по модулю элемент массива = "+max);
        for (int i = 0; i <newMassiv.length; i++) {
            dividedMassiv[i]=newMassiv[i]/max;
        }
        System.out.print("Новый массив "+ Arrays.toString(dividedMassiv));
    }
}

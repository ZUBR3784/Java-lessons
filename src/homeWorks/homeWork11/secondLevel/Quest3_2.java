package homeWorks.homeWork11.secondLevel;

import java.util.Arrays;
import java.util.Random;

public class Quest3_2 {
    public static void main(String[] args) {
        Random random = new Random();
        int sizeMass= 10;
        int[] newMassiv = new int[10];

        for (int i = 0; i <newMassiv.length; i++) {
            newMassiv[i]= Math.abs(random.nextInt(sizeMass)+1);
        }
        System.out.println(Arrays.toString(newMassiv));

        for (int i = 1; i <newMassiv.length; i++) {
//            int numOfMass=0;
            if (newMassiv[i-1]<newMassiv[i]){
                System.out.println("Значение элемента "+newMassiv[i]+ " больше "+newMassiv[i-1]);
            }
        }
    }
}
//Вывести элементы числового массива, которые больше, чем элементы, стоящие перед ними.
//
//Например, дан массив [3, 9, 8, 4, 5, 1]. Следует вывести числа 9 и 5,
// так как перед ними стоят соответственно числа 3 и 4, которые меньше их.

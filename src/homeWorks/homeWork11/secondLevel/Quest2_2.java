package homeWorks.homeWork11.secondLevel;

import java.util.Arrays;
import java.util.Random;

public class Quest2_2 {
    public static void main(String[] args) {
        Random random = new Random();
        int sizeMass= 10;
        int sum =0;
        int[] newMassiv = new int[10];

        for (int i = 0; i <newMassiv.length; i++) {
            newMassiv[i]= Math.abs(random.nextInt(sizeMass)+1);
            sum+=newMassiv[i];
            }
        System.out.println(Arrays.toString(newMassiv));
        System.out.println("Сумма элементов равна "+sum);

        int arithmeticMean= sum/sizeMass;
        System.out.println("Среднее арифметическое значение элементов массива = "+arithmeticMean);

        for (int i = 0; i <newMassiv.length; i++) {
            if (newMassiv[i]>arithmeticMean){
                System.out.println("Значение элемента"+newMassiv[i]+ " больше "+arithmeticMean);
            }
        }
    }
}
//Дан массив(сгенерируйт значения). Найти среднее арифметическое его элементов.
// Вывести на экран только те элементы массива, которые больше найденного среднего арифметического.

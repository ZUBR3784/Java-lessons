package homeWorks.homeWork12.firstLevel;

import java.util.Arrays;

public class Quest8_1 {
    public static void main(String[] args) {
        int[] mass = {1,56,34,3,12,78,45,34,23,56,89,56,1,4};

        for (int i = 0; i < mass.length; i++) {
            System.out.println( (mass[i]));
        }

        for (int i = 0; i < mass.length/2; i++) {
            int swapVal = mass[mass.length - i -1];
            mass[mass.length - i -1] = mass[i];
            mass[i] = swapVal;
        }
        System.out.println(Arrays.toString(mass));

        int sum =0;
        for (int i = 0; i < mass.length; i++) {
            sum += mass[i];
        }
        System.out.println(sum);

        int even = 0;
        int uneven = 0;
        for (int i = 0; i <mass.length; i++) {
            if (mass[i]%2==0) {
                even++;
            }else {
                uneven++;
            }
        }
        if (even> uneven){
            System.out.println("В массиве больше четных "+even+" : "+uneven);
        }else if (uneven>even){
            System.out.println("В массиве больше нечетных "+uneven+" : "+even);
        }else {
            System.out.println("В массиве одинаковое зколичество четных и нечетных значений "+even+" : "+uneven);
        }
    }
}
//Есть массив чисел. Создайте его сами, и наполните сами. Нужно напечатать на консоль:
//значение каждой ячейки массива (пройтись циклом)
//значение каждой ячейки всего массива с конца в начало
//сумму значений всех ячеек
//напечатать кого в массиве больше, четных или нечетных?

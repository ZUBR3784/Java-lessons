package homeWorks.homeWork11.firstLevel;

import java.util.Arrays;

public class Quest1_1 {
    public static void main(String[] args) {
        int[] arr ={ -2, -3, -4, 1, 3, 5};
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>0){
                System.out.println("Первый положительный элемент массива = "+arr[i] +", номер элемента "+i);
                break;
            }
        }

    }
}
//Найти номер и значение первого положительного элемента массива.

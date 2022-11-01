package homeWorks.homeWork12.secondLevel;

import java.util.Arrays;

public class Quest1_2 {
    public static void main(String[] args) {
        int[] arr = {2,56,34,3,12,78,45,34,23,56,89,56,1,4};
        int k = 5;
        for (int i = 0; i < arr.length; i++) {
            int min = arr[0];
            int minIndex = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < min){
                    min = arr[j];
                    minIndex = j;
                }
            }
            int swapVal = arr[minIndex];
            arr[minIndex] = arr[k];
            arr[k] = swapVal;
        }
        System.out.println(Arrays.toString(arr));
    }
}
//Дан массив arr[] и целое число K , где K меньше размера массива, задача состоит в том, чтобы найти
// K -й наименьший элемент в данном массиве. Дано, что все элементы массива различны. Распечатать индекс и число.
// Подсказка: сначала отсортировать, и после найти элемент с инлексом K

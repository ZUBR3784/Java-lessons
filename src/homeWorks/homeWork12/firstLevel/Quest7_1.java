package homeWorks.homeWork12.firstLevel;

import java.util.Arrays;

public class Quest7_1 {
    public static void main(String[] args) {
            int[] mass = {1,56,34,3,12,78,45,34,23,56,89,56,1,4};
            System.out.println(Arrays.toString(sortArray(mass)));
        }
        private static int[] sortArray(int[] arr){
            for (int i = 0; i < arr.length; i++) {
                int min = arr[0];
                int maxIndex = 0;
                for (int j = 0; j < arr.length - i; j++) {
                    if (arr[j] < min){
                        min = arr[j];
                        maxIndex = j;
                    }
                }
                int swapVal = arr[arr.length - i -1];
                arr[arr.length - i -1] = arr[maxIndex];
                arr[maxIndex] = swapVal;
            }
            return arr;
        }
    }
//Напишите программу которая сортирует массив в обратном порядке
//
// Например для массива {1,56,34,3,12,78,45,34,23,56,89,56,1,4} после сортировки будет
// [89, 78, 56, 56, 56, 45, 34, 34, 23, 12, 4, 3, 1, 1]
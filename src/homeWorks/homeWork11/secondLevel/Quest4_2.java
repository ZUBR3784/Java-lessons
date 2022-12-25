package homeWorks.homeWork11.secondLevel;

import java.util.Arrays;
import java.util.Random;

public class Quest4_2 {
    public static void main(String[] args) {
        int sizeOfMas = 10;
        int limitOfNum = 5;
        int[] massive = new int[sizeOfMas];
        Random random = new Random();
        for (int i = 0; i < massive.length; i++) {
            massive[i]= random.nextInt(limitOfNum);
        }
        System.out.println(Arrays.toString(massive));
        int maxLenght = 1;
        int maxLenghtInd =0;
        int maxForNow =1;
        int bestIndex =0;
        for (int i = 1; i < massive.length; i++) {
            if (massive[i-1]== massive[i]){
                maxForNow++;
            }else {
                if (maxLenght < maxForNow){
                    maxLenghtInd = bestIndex;
                    maxLenght = maxForNow;
                }
                bestIndex =i;
                maxForNow =1;
            }
        }
        if (maxLenght< maxForNow){
            maxLenghtInd = bestIndex;
            maxLenght= maxForNow;
        }
        System.out.println(maxLenghtInd);
        System.out.println(maxLenght);
    }
}
//Найти в массиве самую длинную последовательность, состоящую из одинаковых элементов.
// Вывести на экран количество элементов самой длиной последовательности и номер элемента, который является ее началом.
//
//Например, если массив выглядит так:
//0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0
//, то количество элементов самой длинной последовательности, состоящей из одинаковых элементов, равно 5, а начинается она с 9-го элемента.

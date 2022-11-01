package homeWorks.homeWork12.firstLevel;

import java.util.Scanner;

public class Quest5_1 {
    public static void main(String[] args) {//----------->>> Как её решить, мне кажется я уже всё попробовал(((((
        Scanner scan =new Scanner(System.in);
        System.out.println("Введите фразу: ");
        String myPhrase= scan.next();
        System.out.println(myPhrase);
        int dividers =0;
        int words=0;
        int[] symbOfPhrase=new int[myPhrase.length()];
        for(int j = 0; j <myPhrase.length(); j++) {
        }
    }
}
//Подсчитать количество слов во введенной пользователем строке.
// Считаем, что слова разделяются исключительно одним пробелом,
// а первый и последний символы строки не являются пробелами.
// Например в строке "Мама мыла раму" 3 слова подсказка:
// Символом разделителя является ' ', можно пройтись с помощью for по строке

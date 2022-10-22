package homeWorks.homeWork10.firstPart;

import java.util.Scanner;

public class Quest1_3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Введите высоту треугольника: ");
        int hight = scanner.nextInt();
        for (int i = 0; i <hight ; i++) {
            for (int j = 0; j <hight -i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <i*2 - 1 ; j++) {
                System.out.print("^");
            }
            System.out.println("");
        }
    }
}
//распечатать треугольник из символов ^. Высоту выбирает пользователь. Например: высота = 5, на экране

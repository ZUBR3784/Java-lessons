package homeWorks.homeWork2.secondLevel;

import java.util.Scanner;

public class Figure {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите меньшую сторону прямоугольника:");
        int x = scan.nextInt();
        System.out.print("Введите большую сторону прямоугольника:");
        int y = scan.nextInt();
        int s = y * x;
        int p = 2 * y + 2 * x;
        System.out.println("Площадь прямоугольника со сторонами = " + x + " и " + y + " Равна " + s);
        System.out.println("Периметр прямоугольника со сторонами = " + x + " и " + y + " Равна " + p);
    }
}

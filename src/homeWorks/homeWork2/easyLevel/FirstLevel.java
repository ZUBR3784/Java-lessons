package homeWorks.homeWork2.easyLevel;
import java.util.Scanner;
public class FirstLevel {
    public static void main(String[] args) {
        int hex1;
        int hex2;
        int dec = 637;
        int hex;
        hex = dec % 16;//- Как превратить это число в 'D' ?????
        dec = dec / 16;
        hex1 = dec % 16;
        dec = dec / 16;
        hex2 = dec % 16;
        System.out.println("dec -> hex for 637:" + hex2 + hex1 + hex);

        int hexAter;
        hexAter = (hex2 * 16 * 16) + (hex1 * 16) + (hex * 1);
        System.out.println("hex -> dec for 27D:" + hexAter);

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число:");
        int x = scan.nextInt();
        int formula = x * x;
        System.out.println("x * x =" + formula);

        int A = 1000;
        int B = 500;
        int AB = A + B - 100;
        System.out.println("Сумма А + В со скидкой:" + AB + "\n" + "Сумма скидки:" + 100);

        int q = 16;
        int w =3;
        int e = q + w;
        int t = q -w;
        System.out.println("Сумма 16 и 3 ="+ e + "\n" + "Разность 16 и 3 ="+ t );
    }
}

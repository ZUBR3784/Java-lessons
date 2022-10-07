package homeWorks.homeWork5;

import java.util.Scanner;

public class SecondLevel {

    public static void main(String[] args) {
        int temperature1 = 111;
        int temperature2 = 80;
        boolean workOrNo = temperature1 > 100 && temperature2 < 100;;
        System.out.println(workOrNo);

        Scanner firstNumber = new Scanner(System.in);
        int fNumber =firstNumber.nextInt();
        Scanner secondNumber = new Scanner(System.in);
        int sNumber =secondNumber.nextInt();
        boolean divider = fNumber % sNumber == 0;
        System.out.print(divider);
    }
}

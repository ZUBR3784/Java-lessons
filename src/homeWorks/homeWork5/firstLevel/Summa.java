package homeWorks.homeWork5.firstLevel;

import java.util.Scanner;

public class Summa {
    public  Summa(){
        System.out.print("Inter first number:");
        Scanner firstNum = new Scanner(System.in);
        String num = firstNum.next();
        int intNum = Integer.parseInt(num);

        System.out.print("Inter second number:");
        Scanner firstNum2 = new Scanner(System.in);
        String num2 = firstNum.next();
        int intNum2 = Integer.parseInt(num2);

        System.out.print("Inter third number:");
        Scanner firstNum3 = new Scanner(System.in);
        String num3 = firstNum.next();
        int intNum3 = Integer.parseInt(num3);

        int sumAllNum = intNum + intNum2 + intNum3;
        System.out.println("The result is:" + sumAllNum );
    }
}

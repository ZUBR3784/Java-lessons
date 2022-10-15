package homeWorks.homeWork4.secondLevel;

import java.util.Scanner;

public class ConvertEurToUsd {
//    double exchangeUsdToEur = 0.98;
//    double exchangeEuroToUsd = 1.02;


    public ConvertEurToUsd() {
        System.out.print("What is the exchange rate from Euro to USD?: ");
        Scanner ex = new Scanner(System.in);
        double exchange = ex.nextDouble();
        System.out.print("How mach Euro do you have?");
        Scanner euro = new Scanner(System.in);
        double eur = euro.nextDouble();
        double e = eur * exchange;
        System.out.println(e +" Dollars you take");

        System.out.print("How mach Dollars do you have?");
        Scanner dollar = new Scanner(System.in);
        double dol = dollar.nextDouble();
        System.out.print("What is the exchange rate from USD to Euro?: ");
        Scanner ex2 = new Scanner(System.in);
        double exchange2 = ex2.nextDouble();
        double d = dol * exchange2;
        System.out.println(d + "Euro you take");
    }
}

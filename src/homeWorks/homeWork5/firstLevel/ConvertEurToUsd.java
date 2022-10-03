package homeWorks.homeWork5.firstLevel;

import java.util.Scanner;

public class ConvertEurToUsd {
    double exchangeUsdToEur = 0.98;
    double exchangeEuroToUsd = 1.02;


    public ConvertEurToUsd() {
        System.out.print("How mach Euro do you have?");
        Scanner euro = new Scanner(System.in);
        double eur = euro.nextDouble();
        double e = eur * exchangeUsdToEur;
        System.out.println(e);

        System.out.print("How mach Dollars do you have?");
        Scanner dollar = new Scanner(System.in);
        double dol = dollar.nextDouble();
        double d = dol * exchangeEuroToUsd;
        System.out.println(d);
    }
}

package homeWorks.homeWork5.firstLevel;

import java.util.Scanner;

public class ConvertationTemperature {
    public ConvertationTemperature(){
        System.out.println("What is the temperature by Pharingate?:");
        Scanner temp = new Scanner(System.in);
        double tempPh = temp.nextDouble();
        double cels = (tempPh - 32.0) / 1.8;
        System.out.println("The temperature by Celsium is :" + cels);
        System.out.println("What is the temperature by Celsium?:");
        Scanner temp2 = new Scanner(System.in);
        double tempCel = temp2.nextDouble();
        double phar = (tempCel * 1.8 + 32.0);
        System.out.println("The temperature by Pharingate is :" + phar);
    }
}

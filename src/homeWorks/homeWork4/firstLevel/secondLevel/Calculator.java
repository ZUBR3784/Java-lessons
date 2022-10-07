package homeWorks.homeWork4.firstLevel.secondLevel;

import java.util.Scanner;

public class Calculator {

    double add (double firs, double sekond) {
        return firs + sekond;
    }
    double minus (double firs, double sekond){
        return firs - sekond;
    }

    double multiply (double firs, double sekond){
        return firs * sekond;
    }

    double divide (double firs, double sekond){
        return firs / sekond;
    }

    public static void main(String[] args) {
        System.out.print("Введите первое число:");
        Scanner fir = new Scanner(System.in);
        String first = fir.next();
        double firs = Double.parseDouble(first);

        System.out.print("Введите второе число:");
        Scanner sec = new Scanner(System.in);
        String second = sec.next();
        double seco = Double.parseDouble(second);

        Calculator calc = new Calculator();
        System.out.println( "Сумма чисел: "+ calc.add(firs,seco));
        System.out.println("Часное чисел: "+ calc.divide(firs,seco));
        System.out.println("Разность чисел: "+ calc.minus(firs,seco));
        System.out.println("Произведение чисел: "+ calc.multiply(firs,seco));
    }
}

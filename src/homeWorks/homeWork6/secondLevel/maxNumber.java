package homeWorks.homeWork6.secondLevel;

import java.util.Scanner;

public class maxNumber {
    public static void main(String[] args) {
        System.out.print("Enter first number: ");
        Scanner scan1 = new Scanner(System.in);
        int first = scan1.nextInt();

        System.out.print("Enter second number: ");
        Scanner scan2 = new Scanner(System.in);
        int second = scan2.nextInt();

        System.out.print("Enter third number: ");
        Scanner scan3 = new Scanner(System.in);
        int third = scan3.nextInt();

        if (first>=second && first>=third){
            System.out.println(first);
        } else if (second >= first && second >= third){
            System.out.println(second);
        } else {
            System.out.println(third);
        }
    }
}

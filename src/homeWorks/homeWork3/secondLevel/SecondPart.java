package homeWorks.homeWork3.secondLevel;

import java.util.Scanner;
    public  class SecondPart {
        public static void main (String[] args) {
            System.out.println("What is your name?");
            Scanner scan = new Scanner(System.in);
            String name = scan.next();
            System.out.println("Hello" + name);

            System.out.println("What is your name?");
            Scanner scan2 = new Scanner(System.in);
            String name2 = scan.next();
            char firstLetter = name2.charAt(0);
            System.out.println("Your name starts from:" + firstLetter);

            double d = 59.976;
            int t = (int) d;
            System.out.println(t);

            int q = 475;
            short s = (short) q;
            System.out.println(q);
        }
    }

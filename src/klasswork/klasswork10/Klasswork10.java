package klasswork.klasswork10;

import homeWorks.homeWork4.secondLevel.Calculator;

import java.util.Random;
import java.util.Scanner;

public class Klasswork10 {

    public static void main(String[] args) {


        //Создать программу, выводящую на экран случайно сгенерированное трёхзначное
        // натуральное число и его наибольшую цифру.
        Random random=new Random();
//        int num = random.nextInt(900) +100;//899+100->999
//        System.out.println(num);
//        int maxnum = 0;
//        while (num>0){
//            int currentdigit =num%10;
//            if (currentdigit> maxnum){
//                maxnum=currentdigit;
//            }
//            num=num/10;
//        }
//        System.out.println(maxnum);


        //сломанный лифт
        //лифт, находящийся на первом этаже здания высотой H, должен подняться на последний этаж.
        // Лифт сломан. Каждый раз он поднимается на N этажей и спускается на M этажей.
        // Если на последнем подьеме лифт превысил колличество этажей,
        // то считается что лифт поднялся на самый верх. Найдите количество подьемов,
        // которые понадобятся лифту.

//        int h =100;
//        int n =50;
//        int m =1;
//        int count =0;
//        int current =1;
//        while (current<h){
//            count++;
//            current+=....
//        }

        // игра в 21
//        int carrentVal;
//        int sum =0;
//        do {
//            carrentVal=random.nextInt(12);
//            sum+=carrentVal;
//        }while (sum<21);
//        System.out.println(sum);

        //напечатать все соверш числа(равн сумме всех своих делителей) от 1 до10000  н.р 6 = 1+2+3
//        for (int i = 1; i <= 10000; i++) {
//            if (isNumExelent(i)){
//                System.out.println("sovershennoe chislo  "+ i);
//            }
//        }
//    }
//    private static boolean isNumExelent(int num) {
//        int sumOfDividers = 0;
//        for (int i = 1; i <= num; i++) {
//            if (num % i == 0) {
//                sumOfDividers += i;
//            }
//        }
//        return sumOfDividers==num;

//полендром или нет?
//        String palendrom = "а роза упала на лапу азора";
//        int lenght = palendrom.length();
//        boolean isPalendromSymbol=true;
//        for (int i = 0; i < lenght/2; i++) {
//            char fromFirst = palendrom.charAt(i);
//            char fromSecond = palendrom.charAt((lenght-1) -i);
//            if (fromFirst!=fromSecond){
//                System.out.println("ne polindrom");
//                return;
//            }
//        }
//        System.out.println("polindrom");
        //вывести все нечётные числа
//        int sumOfNum=0;
//        for (int i = 0; i <100 ; i++) {
//            if (i%2!=0){
//                System.out.println("nechet");
//                continue;// аканч раб с данн числ и переходит к след
//            }
//                sumOfNum+=i;
//            if (true){
//                System.out.println("chetnoe");
//            }
//        }

        //калькулятор
//        Scanner scanner=new Scanner();
//        Calculator calculator=new Calculator();
//        while (true){
//            String operation =scanner.next();
//            switch (operation){
//                case "+":
//                    System.out.println(calculator.add);
//            }
//        }


        //рисуем треугольник
        int hight =10;
        for (int i = 0; i <hight ; i++) {
            for (int j = 0; j <hight -i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <i*2 - 1 ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }






        }
    }

package homeWorks.homeWork7.secondLevel;

import java.util.Scanner;

public class Dollars {
    public static void main(String[] args) {
        System.out.println("Введите сумму к выдаче: ");
        Scanner scan = new Scanner(System.in);
        int issuanceAmount = scan.nextInt();
        System.out.print(issuanceAmount + " -");//1234
            int tousants = issuanceAmount/1000;//1
            int hundred = (issuanceAmount%1000)/100;//2
            int decade = (issuanceAmount%100)/10;
            int teen = (issuanceAmount%100);
            int units = issuanceAmount%10;
            switch (tousants){
                case 1: System.out.print(" одна тысяча ");
                break;
                case 2: System.out.print(" две тысячи ");
                    break;
                case 3: System.out.print( " три тысячи ");
                    break;
                case 4: System.out.print(  " четыре тысячи ");
                    break;
                case 5: System.out.print(" пять тысяч ");
                    break;
                case 6: System.out.print(  " шесть тысяч ");
                    break;
                case 7: System.out.print(  " семь тысяч ");
                    break;
                case 8: System.out.print(  " восемь тысяч ");
                    break;
                case 9: System.out.print(  " девять тысяч ");
                    break;
            }
            switch (hundred) {
                case 1: System.out.print( " сто ");
                    break;
                case 2: System.out.print( " двести ");
                    break;
                case 3: System.out.print( " триста ");
                    break;
                case 4: System.out.print( " четыреста ");
                    break;
                case 5: System.out.print( " пятьсот ");
                    break;
                case 6: System.out.print( " шестьсот ");
                    break;
                case 7: System.out.print( " семьсот ");
                    break;
                case 8: System.out.print( " восемьсот ");
                    break;
                case 9: System.out.print( " девятьсот ");
                    break;
            }
            switch (decade) {
                case 2: System.out.print( " двадцать ");
                    break;
                case 3: System.out.print( " тридцать ");
                    break;
                case 4: System.out.print( " сорок ");
                    break;
                case 5: System.out.print( " пятьдесят ");
                    break;
                case 6: System.out.print( " шестьдесят ");
                    break;
                case 7: System.out.print( " семьдесят ");
                    break;
                case 8: System.out.print( " восемьдесят ");
                    break;
                case 9: System.out.print( " девяносто ");
                    break;}
        if (decade == 1) {
            switch (teen ) {
                case 10: System.out.print( " десять долларов");
                    break;
                case 11: System.out.print( " одиннадцать долларов");
                    break;
                case 12: System.out.print( " двенадцать долларов");
                    break;
                case 13: System.out.print( " тринадцать долларов");
                    break;
                case 14: System.out.print( " четырнадцать долларов");
                    break;
                case 15: System.out.print( " пятнадцать долларов");
                    break;
                case 16: System.out.print( " шеснадцать долларов");
                    break;
                case 17: System.out.print( " семьнадцать долларов");
                    break;
                case 18: System.out.print( " восемьнадцать долларов");
                    break;
                case 19: System.out.print( " девятнадцать долларов");
                    break;
            }
        } else if (decade !=1) {
        switch (units) {
            case 1:
                System.out.print(" один доллар ");
                break;
            case 2:
                System.out.print(" два доллара ");
                break;
            case 3:
                System.out.print(" три доллара ");
                break;
            case 4:
                System.out.print(" четыре доллара ");
                break;
            case 5:
                System.out.print(" пять долларов ");
                break;
            case 6:
                System.out.print(" шесть долларов ");
                break;
            case 7:
                System.out.print(" семь долларов ");
                break;
            case 8:
                System.out.print(" восемь долларов ");
                break;
            case 9:
                System.out.print(" девять долларов ");
                break;
            case 0:
                System.out.print(" долларов ");
                break;
        }
        }
    }
}
//Пользователь вводит число от 1 до 9999 (сумму выдачи в банкомате).
// Необходимо вывести на экран словами введенную сумму и в конце
// написать название валюты с правильным окончаниедин доллм. Например:
//// 7431 – семь тысяч четыреста тридцать оар,
// 2149 – две тысячи сто сорок девять долларов, 15 – пятнадцать долларов,
// 3 – три доллара. Для решения этой задачи вам необходимо будет применять оператор % (остаток от деления)
//1 доллар

//2 доллара
//3 доллара
//4 доллара

//5 долларов
//6 долларов
//7 долларов
//8 долларов
//9 долларов
//0 долларов
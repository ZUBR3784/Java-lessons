package homeWorks.homeWork7.easyLevel;

import java.util.Scanner;

public class NumOfFlat {
    public static void main(String[] args) {
        System.out.print("Введите номер квартиры: ");
        Scanner scan = new Scanner(System.in);
        int numOfFlat = scan.nextInt();
        if (numOfFlat<21 && numOfFlat>0) {
            System.out.print("Данная квартира находится в 1-ом подъезде");
        }else if (numOfFlat<49 && numOfFlat>20){
            System.out.print("Данная квартира находится в 2-ом подъезде");
        }else if (numOfFlat<91 && numOfFlat>48){
            System.out.print("Данная квартира находится в 3-eм подъезде");
        }else System.out.print("Данной квартиры не существует в этом доме");
    }
}
//В первом подъезде квартиры с 1 по 20. Во втором с 21 по 48. В третьем с 49 по 90.
// Пользователь вводит номер квартиры. Программа должна указать в каком подъезде находится данная квартира.
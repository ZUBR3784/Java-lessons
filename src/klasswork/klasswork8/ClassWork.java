package klasswork.klasswork8;

import java.util.Scanner;

public class ClassWork {
    public static void main(String[] args) {
        boolean accept = accept();
        if (accept){
            System.out.println("Accept project");
        }
        else {
            System.out.println(" Project not accept ");
        }
        System.out.println(accept);

    }
    static boolean accept(){
        Scanner scan = new Scanner(System.in);
        boolean hasroof = scan.nextBoolean();
        boolean haswall = scan.nextBoolean();
        int high = scan.nextInt();
        return hasroof && haswall && high == 14;

    }
//    public void check(int raiting){
//        if (raiting>86){
//            System.out.println(5);
//        }else if (raiting > 72){
//            System.out.println(4);
//        }else if (raiting > 56){
//            System.out.println(3);
//        }else {
//            System.out.println(2);
        }
//    }

//    public static void checker(String[] args) {
//        RaitingChecker raitingChecker = new RaitingChecker() ;
//
//    }
//}

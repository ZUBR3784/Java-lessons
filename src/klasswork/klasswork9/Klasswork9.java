package klasswork.klasswork9;

import java.util.Random;
import java.util.Scanner;

public class Klasswork9 {
    public static void main(String[] args) {
//        int sum = 0;
//        int i =0;//иниц услов
//        while (i< 100){//провер усл
//            sum +=i
//            System.out.println(i);//тело метода
//            i++;//обновл парам для услов
//        }
////        for (int j = 0; j <100 ; j++) {//так выгляд тоже самое в фор
////        }
//        System.out.println(sum);


//        Random random=new Random();
//        int num=random.nextInt(10000);
//        int sum=0;
//        System.out.println(num);
//        while (num>0){
//            int digit = num%10;
//            sum+= digit;
//            num/=10
//        }
//        System.out.println(sum);


//        int i =10;
//        do {
//            System.out.println(i);
//            i++;
//        }while (i<10);


//        Scanner scanner = new Scanner(System.in);
//        int bank = scanner.nextInt();
//        int cashToMe = scanner.nextInt();
//        int howMachIHave = scanner.nextInt();
//        int howMuchITry = 0;
//        while (howMachIHave > 0) {
//            int maxDivided =maxDivided(howMachIHave);
//            howMachIHave -=maxDivided;
//            System.out.println(howMuchITry);
//        }
//    }
//
//        static int maxDivided(int num) {
//            for (int i = num/2; i >0 ; i--) {
//                if (num%1==0){
//                    return i;
//            }
//        }
//
//
//            return num;
        //1 2 4 8 16 32 64 128 256 512
//        int num =1;
//        while (num<512){
//            num=num+num;
//
//        }
//        System.out.println(num);





//        Random random=new Random();
//        int num= random.nextInt(100);
//        Scanner scan = new Scanner(System.in);
//
//        int sec =;
//        int howMuchWeTry=0;
//        do {
//            sec=scan.nextInt();
//            if (num>sec){
//                System.out.println("No,more");//hzzz
//            }else if (num<sec){
//                System.out.println("No,litle");
//            }
//        }while (sec);
//        System.out.println();
//
//        }
//        Random random=new Random();
//        int num =random.nextInt(50);
//        System.out.println("Число "+num+" это сумма чисел: ");
//        for (int i = 0; i <=num; i++) {
//            for (int j = 0; j <=num/2; j++) {
//                if (i+j==num){
//                System.out.println(i+"and"+j);}
//            }
//        }
//       int start = 312;
//       int reverse =0;//развернуть
//        while (start>0){
//            int un =start%10;
//            System.out.println(un);
//            reverse= reverse * 10 + un;
//            start /= 10;
//        }

        int myNum =1234;// найти, наибольшую цифру
        int max =0;
        while (myNum>0){
            int un =myNum%10;
            System.out.println(un);
            if (max<=un){
                max=un;
            }
            myNum /= 10;
    }
        System.out.println(max);


}
}



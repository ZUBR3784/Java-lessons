package homeWorks.homeWork8.secondtLevel;


import java.util.Scanner;

public class Quest3_2 {
    public static void main(String[] args) {//1*2*3*4*5=120
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число,факториал которого нужно вычислить: ");
        int fak = scan.nextInt();
        int n =1;
        for (int i = 1; i <=fak; i++) {
            n = n *i;
        }
        System.out.println(fak+"!"+"="+n);
    }
}
//Высчитать факториал числа n. Факториал 5 = 12345
//public static int getFactorial(int f) {
//  int result = 1;
//  for (int i = 1; i <= f; i++) {
//     result = result * i;
//  }
//  return result;
//}
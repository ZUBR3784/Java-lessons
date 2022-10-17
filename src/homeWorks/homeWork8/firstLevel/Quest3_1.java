package homeWorks.homeWork8.firstLevel;

public class Quest3_1 {
    public static void main(String[] args) {
        for (int j = 10; j <100; j++) {
            if (j%4==0 && j%6!=0 ){
                System.out.println(j);
            }
        }
    }
}
//Вывести на консоль те из двузначные числа которые делятся на 4, но не делятся на 6.

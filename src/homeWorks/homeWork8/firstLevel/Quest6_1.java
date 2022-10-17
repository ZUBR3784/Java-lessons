package homeWorks.homeWork8.firstLevel;

public class Quest6_1 {
    public static void main(String[] args) {
        int multi = 1;
        for (int i = 13; i <=100 ; i=i+13) {
            if ( i%2 !=0 ) {
           multi=multi * i;

            }
        }
        System.out.println(multi);
    }
}
//Вывести на консоль произведение двузначных нечетных чисел кратных 13.
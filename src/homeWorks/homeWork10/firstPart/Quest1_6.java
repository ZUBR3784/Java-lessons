package homeWorks.homeWork10.firstPart;

public class Quest1_6 {
    public static void main(String[] args) {
        int m = 1;
        int n = 100;
        int divider=1;
        for (int i = m; i <=n; i++) {
            for (int j = divider; j <=n/2; j++) {
                if (i==j || i<j){
                    break;
                }
                if (i%j==0 && divider<j){
                 divider=j;
                System.out.println(divider);
                }
            }
        }
    }
}
//Для каждого натурального числа в промежутке от M до N вывести все делители,
// кроме единицы и самого числа. Значения M и N вводятся с клавиатуры.

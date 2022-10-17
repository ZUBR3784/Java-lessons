package homeWorks.homeWork8.secondtLevel;

public class Qest2_2 {
    public static void main(String[] args) {
        int sum = 0;
        int kolich = 0;
        for (int i = 0; i <=100; i++) {
            if (i%2 != 0) {
                for (int j = 1; j <=1; j++) {
                    kolich++;
                }
                sum = sum+i;
            }
        }
        System.out.println("Среднее значение всех нечетных чисел от 0 до 100 = "+sum/kolich);
        System.out.println("Сумма всех нечетных чисел от 0 до 100 = "+sum);
    }
}
//вывести на консоль среднее значение всех нечетных чисел от 0 до 100
//Подсказка: сначала нужно в цикле посчитать сумму, после цикла разделить сумму на количество элементов
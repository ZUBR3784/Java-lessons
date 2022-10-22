package homeWorks.homeWork10.firstPart;

public class Quest1_1 {
    public static void main(String[] args) {
        for (int i = 1000; i <=9999; i++) {
            int tous = i/1000;
            int hundred= (i%1000)/100;
            int dec= (i%100)/10;
            int un = i%10;
            if (tous != hundred && tous!=dec && tous!= un && hundred!= dec && hundred!= un && dec!=un){
                System.out.println(i);
            }
        }
    }
}
//Напечатать все четырехзначные числа, в записи которых нет двух одинаковых цифр.

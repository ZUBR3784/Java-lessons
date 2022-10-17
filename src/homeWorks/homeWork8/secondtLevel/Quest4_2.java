package homeWorks.homeWork8.secondtLevel;

public class Quest4_2 {
    public static void main(String[] args) {
        String str = "456";
        int d =str.length();
        int sum =0;

        for (int i = 0; i <d ; i++) {
            char num = str.charAt(i);
            int transf =Integer.parseInt(String.valueOf(num));
            sum =sum + transf;
        }
        System.out.println(" Cумма этих цифр = "+sum);


//        String str = "123";                 <<--- А не проще ли так??????????
//        int sum1 = Integer.parseInt(str);
//        int hangr = sum1 / 100;
//        int dec = (sum1 % 100) / 10;
//        int un = sum1 % 10;
//        int res = hangr+dec+un;
//        System.out.println(res);
    }
}
//Дана строка из 3-х цифр. Найдите сумму этих цифр. То есть сложите как числа первый символ строки, второй и третий.
//подсказка: используйте for чтобы пройтись по номеру символа,
// используйте метод length() у строки чтобы пройтись по каждому символу,
// метод charAt() чтобы достать символ на определенной позиции и метод Integer.parseInt() чтобы перевести в int

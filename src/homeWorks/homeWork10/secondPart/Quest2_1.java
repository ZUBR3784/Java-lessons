package homeWorks.homeWork10.secondPart;

public class Quest2_1 {
    public static void main(String[] args) {
        int years = 10;
        double myMoney =200.0;
        double myMoney2 =200.0;
        double myMoney3 =200.0;
        double myMoneyWithoutCapital =myMoney*0.05;

        for (int i = 0; i <years ; i++) {
            myMoney=myMoney+myMoneyWithoutCapital;
        }
        System.out.println("Сумма без капитализации = "+myMoney);

        for (int i = 0; i < years; i++) {
            double myMoneyAfterYear =myMoney2*0.05;
            myMoney2= myMoneyAfterYear+myMoney2;
        }
        System.out.println("Сумма с капитализацией в конце каждого года = "+myMoney2);

        for (int i = 0; i < years*12; i++) {
            double myMoneyAfterMonth = (myMoney3*0.05)/12;
            myMoney3=myMoneyAfterMonth+myMoney3;
        }
        System.out.println("Сумма с капитализацией в конце каждого месяца = "+myMoney3);
    }
}
//В кассу на пятипроцентный вклад положили 200 рублей. Какой станет сумма вклада через 10 лет?
//5 процентов = 0.05 к примеру 3% от ста рублей 100 *0.03 = 3
//1)посчитатйте сумму без капитализации
//2)посчитайте сумму с капитализацией в конце каждого года
//3)посчитатйте сумму с капитализацией в конце каждого месяца

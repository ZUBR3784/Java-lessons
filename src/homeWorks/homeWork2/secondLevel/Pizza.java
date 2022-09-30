package homeWorks.homeWork2.secondLevel;
 public class Pizza {
    public static void main(String[] args){
       double PI = 3.14;
       double sizePizza = 1.1;
       double calories = 40;
       double calories1 = 14 * 14 * PI;
       double calories2 = 12 * 12 * PI;
       double x = calories1 * calories * sizePizza;
       double y = calories2 * calories * sizePizza;
    System.out.println("калорий будет потрачено если съесть пиццу радиусом 14см:" + x );
    System.out.println("калорий будет потрачено если съесть пиццу радиусом 12см:" + y );
    System.out.print("разница между значениями:" + (x - y));
    }

}



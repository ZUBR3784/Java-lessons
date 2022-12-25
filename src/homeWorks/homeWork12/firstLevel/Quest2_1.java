package homeWorks.homeWork12.firstLevel;

import java.util.Arrays;

public class Quest2_1 {
    public static void main(String[] args) {
         char[] first = {'a','b','c','d','e'};
        char[] second = {'f','g','h','i','g'};
        char[] third =new char[first.length + second.length];
        for (int i = 0; i < first.length; i++) {
            third[i]=first[i];
        }
        for (int i = 0; i < second.length; i++) {
            third[first.length+i]=second[i];
    }
        System.out.println(Arrays.toString(third));}
}
//Есть два массива char[] first = {‘a’,’b’,’c’,’d’,’e’} и
// char[] second = {‘f’,’g’,’h’,’i’,’g’} создать массив соединяющий два этих массива в один новый

package homeWorks.homeWork11.firstLevel;

import java.util.Arrays;
import java.util.Random;

public class Quest4_1 {
    public static void main(String[] args) {
        Random random=new Random();
        int fromWhatTime = 8;
        int toTime=20;
        int[] hours = new int[toTime-fromWhatTime];
        for (int i = 0 ; i <toTime-fromWhatTime; i++) {
            hours[i]=i+fromWhatTime;
        }
        System.out.println( "Time:        "+Arrays.toString(hours));

        int[] temper =new int[toTime-fromWhatTime];

        int firstTemp = random.nextInt(4)+5;
        int changesTemp= random.nextInt(2)+1;
        for (int i = 0; i < toTime-fromWhatTime; i++) {

            temper[i]=firstTemp-changesTemp;
            changesTemp++;

            if (temper[i]<0){
                System.out.println("Через "+i+" часа(ов) была впервые отмечена отрицательная температура");
                break;
            }
        }
        System.out.println( "Temperature: "+Arrays.toString(temper));
    }
}





//        System.out.println(Arrays.toString(hours));
//        int firstTemp =0;
//        for (int i = 8; i <20 ; i++) {
//            if (hours[i]<0) {
//                firstTemp=i;
//                break;
//            }
//        }
//        System.out.println(firstTemp);


//С 8 до 20 часов температура воздуха измерялась ежечасно.
// Известно, что в течение этого времени температура понижалась.
// Определите, в котором часу была впервые отмечена отрицательная температура.

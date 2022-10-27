package klasswork.klasswork12;

import java.util.Arrays;
import java.util.Random;

public class Klasswork12 {
    public static void main(String[] args) {
        //hw11
//        int size =100;
//        int bound =200;
//        int[] arr = new int[size];
//        Random random =new Random();
//        for (int i = 0; i <size ; i++) {
//            arr[i] = random.nextInt(bound);
//        }
//        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=arr[i] * 2;
//        }


//        int[] degrees = new int[24];
//        Random random=new Random();
//        for (int i = 8; i < 20; i++) {
//            degrees[i]=random.nextInt(10)-3;
//        }
//        System.out.println(Arrays.toString(degrees));
//        int firstTemp =0;
//        for (int i = 8; i <20 ; i++) {
//          if (degrees[i]<0) {
//              firstTemp=i;
//              break;
//          }
//        }
//        System.out.println(firstTemp);

//        int[] degrees = new int[13];
//        Random random=new Random();
//        for (int i = 0; i < 13; i++) {
//            degrees[i]=random.nextInt(10)-3;
//        }
//        System.out.println(Arrays.toString(degrees));
//        int firstTemp =0;
//        for (int i = 0; i <13 ; i++) {
//          if (degrees[i]<0) {
//              firstTemp=i+8;
//              break;
//          }
//        }
//        System.out.println(firstTemp);


//        int[] arr = new int[100];
//        Random random = new Random();
//        double median = 0.0;
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(100);
//            sum+=arr[i];
//        }
//        median=sum/arr.length;
//        System.out.println("Median " + median);
//        for (int i = 0; i <arr.length; i++) {
//            if (arr[i]> median){
//                System.out.println(arr[i]);
//            }
//        }




//        int[] arr = new int[20];
//        Random random = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]= random.nextInt(50);
//        }
//        System.out.println(Arrays.toString(arr));
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i-1]<arr[i]){
//                System.out.println(arr[i]);
//            }
//        }


//        int[] arr = new int[20];
//        Random random = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]= random.nextInt(2);
//        }
//        System.out.println(Arrays.toString(arr));
//        int maxLenght = 1;
//        int maxLenghtIndex =0;
//        int candidateMax=1;
//        int candidateIndex=0;
//        for (int i = 1; i <arr.length; i++) {
//            if (arr[i-1]==arr[i]){
//                candidateMax++;
//            }else {
//                if (maxLenght<candidateMax){
//                    maxLenght=candidateMax;
//                    maxLenghtIndex=candidateIndex;
//                }
//                candidateMax=1;
//                candidateIndex=i;
//            }
//        }
//        if (maxLenght<candidateMax){
//            maxLenght=candidateMax;
//            maxLenghtIndex=candidateIndex;
//        }
//        System.out.println(maxLenghtIndex);
//        System.out.println(maxLenght);

//        klassQuest
//        String[] months = {"янв","февр","март","апр","май","июнь","июль","авг","сент","окт","нояб","декаб",};
//        for (int i = 0; i < months.length; i++) {
//            String month = months[i];
//            System.out.println(month);
//
//            System.out.println(months[i]);
//        }
//        for (String month: months) {//для каждого элем. массива(months) из массива months делай..
//            // (т.е. пройти по каждому элем массива) альтернатива записи:
//            // for (int i = 0; i < months.length; i++)
//            System.out.println(month);
//        }
//
//        //ternaru operator
//        String msg;
//        if (months.length>3){
//            msg="yes";
//        }else {
//            msg="no";
//        }
//
//        msg=months.length>3?"yes":"no";//альтернатива!!!!


        int[] first ={1,2,2,5,7,9,14,56,78};
        int[] second ={1,4,5,6,8,26,66,98};
        int[] result = new int[first.length + second.length];
        int firstId =0;
        int secondId =0;
        int resInd=0;
//        while (firstId < first.length || secondId<second.length){
////            if (firstId == first.length || first[firstId]>= second[secondId]){
////                result[resInd]=second[secondId];
////                secondId++;
////            } else {
////                result[resInd]=first[firstId];
////                firstId++;
////            }
////            resInd++;
////        }
////        System.out.println(Arrays.toString(result));

        //сортировка массивов
        for (int i = 0; i <first.length; i++) {
            result[i] = first[i];
        }
        for (int i = 0; i <second.length; i++) {
            result[i + first.length] = second[i];
        }
        for (int i = 0; i <result.length-i; i++) {
            int max = result[0];
            int maxInd =0;
            for (int j = 0; j <result.length; j++) {
                if (result[j]> max) {
                    max = result[j];
                    maxInd =j;
                }
            }
            int swapVal = result[result.length - i -1];
            result[result.length - i -1] = result[maxInd];
            result[maxInd] = swapVal;
        }
        System.out.println(Arrays.toString(result));








    }
}

package homeWorks.homeWork3.easyLevel;

import homeWorks.homeWork3.secondLevel.SecondPart;

public class FirstLevel {
    public static void main(String[] args) {
        firstPart();
    }
    public static void firstPart(){
        String str1 = "I study Basic Java!";
        char lastSimbol = str1.charAt(18);
        String str2 = "Java";
        boolean search = str1.contains(str2);
        String exchange = str1.replace('a','o');
        String higtRegistr = str1.toUpperCase();
        String lowRegistr = str1.toLowerCase();
        String trimed = str1.substring(13,18);

        int i = 200;
        int q = 470;
        double persent = 200 * 100 / 470.0;

        char g = 'g';
        int index = (int) g;
        System.out.println(lastSimbol + "\n" + search + "\n" + exchange + "\n" + higtRegistr + "\n" + lowRegistr + "\n" + trimed + "\n" + persent+ "\n" + index);
    }

    }



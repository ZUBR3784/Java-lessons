package homeWorks.homeWork4.firstLevel.secondLevel;

import java.util.Scanner;

public  class Finder {
     String text;

     public Finder(String storageString){
         this.text = storageString;
     }

    public int findIndexForString(String input){
        return text.indexOf(input);
     }


    public static void main(String[] args) {
         Finder finder = new Finder( "Мама мыла раму " +"8" +"3");
         Finder finder2 = new Finder( "Мама раму мыла  " +"8" +"3");

            Scanner searchPh = new Scanner(System.in);
            String searchPhrase = searchPh.next();

            int index = finder.findIndexForString(searchPhrase);
            printToConsole(1,index);
            int index2 = finder2.findIndexForString(searchPhrase);
            printToConsole(3,index2);
//            System.out.println(index);
//            System.out.println(index2);
    }
    public static void printToConsole(int numberOfLine,int index){
         System.out.println(numberOfLine + index);
    }
}


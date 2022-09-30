public class Main {
    public static void main(String[] args) {
          System.out.println("Hello world!");
          int dec = 365; //3*100+6*10+5
          int oct;
          oct = dec % 8;//=5
          dec = dec / 8;//=45
          oct = oct * 10 + dec % 8;//=50+5
          dec = dec / 8;//=5
          oct = oct * 10 + dec % 8;//550+5
          System.out.println("dec -> oct for 365:" + oct);
          System.out.println(Integer.toOctalString( 365));

          int decAter;      //oct 555-> dec for 365
          // 555-> 5 * 8 * 8 + 5 * 8 + 5 * 1
          decAter = (oct / 100) * 8 * 8;
          oct = oct % 100;
          decAter = decAter + (oct / 10) * 8;
          oct = oct % 10;
          decAter = decAter + oct;
          System.out.println("oct -> dec for 555:" + decAter);
          System.out.println(decAter);



    }
}
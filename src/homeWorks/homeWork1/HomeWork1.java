package homeWorks.homeWork1;

public class HomeWork1 {
    public static void main(String[] args) {
        System.out.println("First level");
        char c = 'G';
        int i = 89;
        byte b = 4;
        short s = 56;
        float f = 4.355453532f;
        double d = 4.3273568746796;
        long l = 12121212112l;
        System.out.println( c + "\n" + i + "\n" + b + "\n" + s + "\n" + f + "\n" + d + "\n" + l );

        System.out.println("Second level");
        int x = 123;
        int y = x % 2;
        int z = y + 1;
        int k = x - 120;
        System.out.println(y + "\n" + z + "\n" + k);
    }
}

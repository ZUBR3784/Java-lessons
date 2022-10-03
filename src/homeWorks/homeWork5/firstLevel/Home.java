package homeWorks.homeWork5.firstLevel;

public class Home {
    int high = 0;
    int width = 0;
    int length = 0;
    String color = null;
    int room = 0;
    public Home(int high,int width, int length, String color, int room){
        this.high = high;
        this.width = width;
        this.length = length;
        this.color = color;
        this.room = room;
        System.out.println(high + " " + width + " " + length + " " + color + " " + room);
    }
}

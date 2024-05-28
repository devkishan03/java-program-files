package Assignment2;

class Room {
    private int height;
    private int width;
    private int breadth;

    public Room() {
    }

    public Room(int height, int width, int breadth) {
        this.height = height;
        this.breadth = breadth;
        this.width = width;
    }

    public int volume() {
        return height * breadth * width;
    }

}

public class RoomDemo extends Room {

    public RoomDemo(int height, int width, int breadth) {
        super(height, width, breadth);
    }

    public static void main(String[] args) {
        RoomDemo rd = new RoomDemo(2, 7, 5);
        System.out.println(rd.volume());
    }
}

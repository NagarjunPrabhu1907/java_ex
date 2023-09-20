class room {
    int length;
    int breadth;

    room(int x, int y) {
        length = x;
        breadth = y;
    }

    int area() {
        return (length * breadth);
    }

}

class bedroom extends room {
    int height;

    bedroom(int x, int y, int z) {
        super(x, y);
        height = z;
    }

    int volume() {
        return (length * breadth * height);
    }

}

class InherTest {
    public static void main(String args[]) {
        bedroom room1 = new bedroom(15, 012, 4);
        int area1 = room1.volume();
        int volume1 = room1.volume();
        System.out.println("area1= " + area1);
        System.out.println("volume =" + volume1);

    }
}

public class rectangle {
    int length, width, diagonal;

    rectangle(int x, int y) {
        length = x;
        width = y;

    }

    rectangle(int x, int y, int z) {
        length = x;
        width = y;
        diagonal = z;

    }

    int rectArea() {
        return (length * width);
    }

}

package try_catch;

public class LoopDemo {
    public static void main(String args[]) {
        int i = 1;
        while (i <= 3) {
            System.out.println("while loop:i=" + i);
            i = i + 1;
        }
        int j = 1;
        do {
            System.out.println("do loop; j=" + j);
            j++;

        } while (j <= 3);

        j = 1;
        while (j < 3) {
            System.out.println("while loop executed");
            j++;
        }
        do {
            System.out.println("do while loop executed");
        } while (j > 3);

        for (int k = 1; k <= 3; k++) {
            System.out.println("for loop:k=" + k);
        }

        for (int m = 1; m <= 2; m++) {
            for (int n = 1; n <= 3; n++)
                System.out.println("nested loop: m =" + m + ",n=" + n);
        }

    }

}

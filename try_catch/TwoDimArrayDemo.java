package try_catch;

public class TwoDimArrayDemo {
    public static void main(String args[]) {
        int testScores[][] = new int[5][2];
        testScores[0][0] = 75;
        testScores[1][0] = 80;
        testScores[2][0] = 70;
        testScores[3][0] = 85;
        testScores[4][0] = 90;

        testScores[0][1] = 85;
        testScores[1][1] = 80;
        testScores[2][1] = 50;
        testScores[3][1] = 105;
        testScores[4][1] = 99;

        double average;
        for (int col = 0; col < 2; col++) {
            average = 0;
            for (int row = 0; row < 5; row++) {
                average += testScores[row][col];
            }
            average = average / 5;
            System.out.println("test" + (col + 1) + "average is " + average);
        }
    }

}

package java_pgm;

public class MUltiDimentional_Array {
    public static void main(String args[]) {
        int[][] matrix = new int[3][5];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < 5; j++) {
                matrix[i][j] = i + j;

            }
        }
        for (int[] arr : matrix) {
            for (int el : arr) {
                System.out.println(el + "");

            }
            System.out.println();
        }

    }

}

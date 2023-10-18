package java_programs.DSA;

import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  //reads input frm keyboard



        int row = sc.nextInt();   //store i/p at row

        int col = sc.nextInt();   //stores another i/p at col

        int target = sc.nextInt();  //stores another i/p at target

        int[][] array = new int[row][col];  //2d array



        for (int i = 0; i < row; i++) {   //iteration

            for (int j = 0; j < col; j++) {

                array[i][j] = sc.nextInt();

            }

        }

        int count=0;         

        for (int i=1;i<row-1;i++){       //

            for (int j=0;j<col;j++){

                if (array[i][j]*array[i-1][j]*array[i+1][j]==target){

                    count++;

                }

            }

        }

        for (int i=0;i<row;i++){

            for (int j=1;j<col-1;j++){

                if (array[i][j]*array[i][j-1]*array[i][j+1]==target){

                    count++;

                }

            }

        }



        for (int i=0;i<row-2;i++){

            for (int j=col-1;j>=2;j--){

                if (array[i][j]*array[i+1][j-1]*array[i+2][j-2]==target){

                    count++;

                }

            }

        }



        

        for (int i=0;i<row-2;i++){

            for (int j=0;j<col -2;j++){

                if (array[i][j]*array[i+1][j+1]*array[i+2][j+2]==target){

                    count++;

                }

            }

        }

        System.out.println(count);

    }

}
    
    


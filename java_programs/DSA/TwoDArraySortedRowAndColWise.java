package java_programs.DSA;
import java.util.Arrays;

public class TwoDArraySortedRowAndColWise {
    public static void main(String[] args) {
        int[][] arr = {              //2d array
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50} 
        };

        System.out.println(Arrays.toString(search(arr, 33)));
    }

    static int[] search(int[][] arr, int target){ //2args - 2d array and target
        int r = 0; // first row
        int c = arr[0].length - 1;  //last col

        while(r < arr.length - 1 && c > 0 ){ 

            if ( arr[r][c] == target){
                return new int[]{r,c};
            }
            if( arr[r][c] < target){
                r++;
            }else{
                
                c--;
            }
        }
        return new int[]{-1, -1};
    }
}

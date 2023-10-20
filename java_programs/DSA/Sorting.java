package java_programs.DSA;

public class Sorting {
    public static void printarr11ay(int arr11[]){
        for(int i=0;i<arr11.length;i++){
            System.out.println(arr11[i] + "");
        }
        System.out.println();
    }
    public static void main(String args){
        int arr11[] = {7,8,9,3,1,2};
        //bubble sort
        for (int i=0;i<arr11.length-1;i++){
            for(int j=0; j<arr11.length-i-1;j++){
                if(arr11[j]>arr11[j+1]){
                    //swap
                    int temp=arr11[i];
                    arr11[i] = arr11[i+1];
                    arr11[i+1] = temp;

                }
            }
            printarr11ay(arr11);
        }
        

    }
    
}

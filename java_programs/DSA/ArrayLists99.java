package java_programs.DSA;

import java.util.*;


public class ArrayLists99 {

    static List<Integer> compareLists(List<Integer> a, List<Integer> b) {

        List<Integer> list1 = new ArrayList<Integer>();
        list1 = a;

        List<Integer> list2 = new ArrayList<Integer>();
        list2 = b;

        Integer[] arr1 = list1.toArray(new Integer[list1.size()]); //converts

        Integer[] arr2 = list2.toArray(new Integer[list2.size()]);

        int aaa=0;  // used to count how many elements in a are greater 
        int bbb=0;   //and how many are smaller than the corresponding elements in b
        
        for(int i=0; i<list1.size(); i++){   //iterates elements in list 1 & 2 using "i"
            if(arr1[i]==arr2[i])
            {}

            else if(arr1[i]>arr2[i])
            aaa++;    //incrm

            else if(arr1[i]<arr2[i])
            bbb++;   //incrm
        }

        List<Integer> arrFinal = new ArrayList<Integer>();   //new array list &  adds values 
        arrFinal.add(aaa);
        arrFinal.add(bbb);


        return arrFinal;

}
    
    /*-- Inputs from the main method --*/
    
    public static void main(String[] args){
    
        List<Integer> A = new ArrayList<>();
        A.add(20);
        A.add(30);
        A.add(40);
        A.add(50);
        
        List<Integer> B = new ArrayList<>();
        B.add(40);
        B.add(40);
        B.add(40);
        B.add(40);
        
        List<Integer> list = compareLists(A,B);
        
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        
    }
}

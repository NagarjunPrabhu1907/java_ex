
package java_practise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("virat kohli");
        list.add("Ab Develliers");
        list.add("Yuvaraj singh");
        System.out.println("converting arraylist to array");

        String[] item = list.toArray(new String[list.size()]);
        for (String s : item) {
            System.out.println(s);

        }
        System.out.println("converting Array to ArrayList");
        List <String> list2 =new ArrayList<>();
        list2 = Arrays.asList(item);
        System.out.println(list2);


    }

}

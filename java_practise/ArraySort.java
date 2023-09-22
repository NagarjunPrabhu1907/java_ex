
// package java_practise;

// import java.util.Arrays;

// public class ArraySort {
//     public static void Main(String args[]) {
//         String[] countries = { "India", "South_Africa", "Sri lanka", "West Indies", "Australia", "Bhuthan", "America" };
//         Arrays.sort(countries);
//         for (int i = 0; i < countries.length; i++) {
//             System.out.println(countries[i]);
//         }

//     }
// }

package java_practise; // Corrected the package name to "java_practice"

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) { // Corrected the method name to "main"
        String[] countries = { "India", "South_Africa", "Sri lanka", "West Indies", "Australia", "Bhutan", "America" };
        Arrays.sort(countries);
        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i]);
        }
    }
}
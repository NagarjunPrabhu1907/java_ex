
package java_practise;

public class Adding {
    public static void main(String args[]) {
        float sum = 0;
        float[] arr = { 1.5f, 1.5f, 2.4f, 5.5f, 5.5f };
        for (float el : arr) {
            sum += el;
        }
        System.out.println(sum);

    }
}
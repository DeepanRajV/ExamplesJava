import java.util.Arrays;
import java.util.Random;

public class Ex1FirstRepNum {
    public static void main(String[] args) {
        
        int n = 10;
        int[] a = new int[n];
        
        Random random = new Random();
        
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(n) + 1;
        }
        System.out.println(Arrays.toString(a));
        
        for (int i : a) {
            int index = Math.abs(i) - 1;
            if (a[index] < 0) {
                System.out.println("First repeated number : " + Math.abs(i));
                return;
            } else {
                a[index] = -a[index];
            }
        }
        System.out.println("No repeated numbers");
    }
}

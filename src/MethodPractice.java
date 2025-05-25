import java.util.Arrays;

public class MethodPractice {
    public static void main(String[] args) {
        int[] max = {322, 42, 56, 4, 234, 574, 53, 234};
        print(max);
        System.out.println(Arrays.toString(max));
    }

    public static void print(int[] a) {
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i] + ",");
        }
        System.out.println("]");
    }
}




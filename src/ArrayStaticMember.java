import java.util.Arrays;
import java.util.Random;

public class ArrayStaticMember {
    public static void main(String[] args) {
        //Random r = new Random();


        int[] a = new int[10];
        System.out.println(Arrays.toString(a));

        Arrays.fill(a, 5);
        System.out.println(Arrays.toString(a));
        /*
        //黑馬
        for (int i = 0; i < a.length; i++) {
            int random = (r.nextInt(100)+1);
            a[i] =  random;
        }
        */

        //JavaRoad
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)((Math.random()*100)+1);
        }
        System.out.println(Arrays.toString(a));

        //排序
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        //搜尋，複數代表搜尋的數字如果要插入是介於第幾個位置。
        int b=15;
        System.out.println(Arrays.binarySearch(a, b));
        //插入自己的數字
        a[Arrays.binarySearch(a, 15)*-1-1] = b;
        System.out.println(Arrays.toString(a));
    }
}

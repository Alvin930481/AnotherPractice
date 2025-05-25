import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        int[] number = new int[5];

        Random r = new Random();

        for (int i = 0; i < number.length; i++) {
            number[i] = r.nextInt(20) + 1;
        }

        Scanner sc = new Scanner(System.in);
        out:
        while(true){
            System.out.print("請猜一個1-20的數字：");
            int guess = sc.nextInt();
            for (int i = 0; i < number.length; i++) {
                if (guess == number[i]){
                    System.out.println("恭喜你猜中了，您猜中了第" + i +"個數字。");
                    break out;
                }
            }
            System.out.println("很抱歉，您沒猜中數字。請再猜一次！");
        }
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + "\t");
        }
    }
}

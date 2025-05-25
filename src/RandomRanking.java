import java.util.Random;
import java.util.Scanner;

public class RandomRanking {
    public static void main(String[] args) {
        int[] member = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < member.length; i++) {
            System.out.println("請輸入第" + (i + 1) + "個員工編號：");
            member[i] = sc.nextInt();
        }

        Random r = new Random();
        for (int i = 0; i < member.length; i++) {
            int index = r.nextInt(member.length);
            int temp = member[i];
            member[i] = member[index];
            member[index] = temp;
        }

        for (int i = 0; i < member.length; i++) {
            System.out.print(member[i] + "  ");
        }
    }
}

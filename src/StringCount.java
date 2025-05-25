import java.util.Scanner;

public class StringCount {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("請輸入待統計文章：");
        String a = scr.nextLine();
        int upper = 0;
        int lower = 0;
        int number = 0;
        int space = 0;
        int others = 0;

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                upper++;
            } else if (c >= 'a' && c <= 'z') {
                lower++;
            } else if (c >= '0' && c <= '9') {
                number++;
            } else if (c == ' ') {
                space++;
            } else {
                others++;
            }

        }
        System.out.println("大寫字元有：" + upper + "個");
        System.out.println("小寫字元有：" + lower + "個");
        System.out.println("數字有：" + number + "個");
        System.out.println("空白鍵有：" + space + "個");
        System.out.println("其他字元有：" + others + "個");
    }
}

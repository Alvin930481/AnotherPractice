package Practice;

import java.util.Scanner;

public class AirplanTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int originalPrice;
        int month;
        int cl;

        System.out.print("請輸入機票原價：");
        originalPrice = sc.nextInt();
        System.out.print("請輸入機票月份：");
        month = sc.nextInt();
        System.out.print("請選擇: 1.頭等艙 2.經濟艙 >>");
        cl = sc.nextInt();

        System.out.println("您查詢的機票價格為：" + price(originalPrice, month, cl));
    }


    //製作運算方法
    public static double price(double price, int month, int cl) {
        if (month >= 5 && month <= 10) {
            switch (cl) {
                case 1:
                    price *= 0.9;
                    break;
                case 2:
                    price *= 0.85;
                    break;
                default:
                    System.out.println("您輸入錯誤的艙等。");
            }
        } else if ((month >= 1 && month <= 4) || month == 11 || month == 12) {
            switch (cl) {
                case 1:
                    price *= 0.7;
                    break;
                case 2:
                    price *= 0.65;
                    break;
                default:
                    System.out.println("您輸入錯誤的艙等。");
            }
        } else {
            System.out.println("您輸入的月份錯誤");
            price = -1;
        }
        return price;
    }
}

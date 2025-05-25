import java.util.Scanner;

public class ClientNumberCheck {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("請輸入員工編號： ");
        String clientNumber = scr.nextLine();
//        //正向邏輯
//        boolean len = clientNumber.length() == 8;
//        boolean firstChar = clientNumber.charAt(0) == 'E';
//        boolean forthChar = clientNumber.charAt(3) == 'A' || clientNumber.charAt(3) == 'B' || clientNumber.charAt(3) == 'C';
//        boolean result = false;
//        if (len && firstChar && forthChar) {
//            for (int i = 1; i < clientNumber.length(); i++) {
//                if (i == 3) {
//                    continue;
//                }
//                if (clientNumber.charAt(i) >= '0' && clientNumber.charAt(i) <= '9') {
//                    result = true;
//                    continue;
//                } else {
//                    result = false;
//                    break;
//                }
//
//            }
//        }


        //反向邏輯
        boolean result = true;
        if (clientNumber.length() != 8) {
            result = false;
        } else if (clientNumber.charAt(0) != 'E') {
            result = false;
        } else if (clientNumber.charAt(3) != 'A' && clientNumber.charAt(3) != 'B' && clientNumber.charAt(3) != 'C') {
            result = false;
        } else {
            for (int i = 1; i < clientNumber.length(); i++) {
                char c = clientNumber.charAt(i);
                if (i == 3) {
                    continue;
                }
                if (c < '0' || c > '9') {
                    result = false;
                    break;
                }
            }
        }


        if (result) {
            System.out.println("恭喜您通過");
        } else {
            System.out.println("您輸入錯誤");
        }
    }
}
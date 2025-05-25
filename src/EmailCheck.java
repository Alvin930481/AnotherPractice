import java.util.Scanner;

public class EmailCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入E-mail:");
        String email = sc.next();

        boolean result = true;
        int atIndex = email.indexOf("@");

        check:
        {
            //長度為128以下
            if (email.length() > 128) {
                result = false;
                break check;
            }
            //一定要有一個＠，且不能在頭、尾
            if (atIndex <= 0 || atIndex != email.lastIndexOf("@") || email.endsWith("@")) {
                result = false;
                break check;
            }


            //檢查@後面條件
            //除了大小寫Ａ-Z及數字和.外，不能是其他東西
            String lastString = email.substring(atIndex + 1);
            for (int i = 0; i < lastString.length(); i++) {
                char c = lastString.charAt(i);
                if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z') && !(c >= '0' && c <= '9') && (c != '.')) {
                    result = false;
                    break check;
                }
            }

            //.不能在頭尾，並且一定要有
            int dotIndex = lastString.indexOf(".");
            if ((dotIndex == 0) || lastString.endsWith(".") || (dotIndex == -1)) {
                result = false;
                break check;
            }

            //.不能連續
            while (dotIndex != -1) {
                if (lastString.charAt(dotIndex + 1) == '.') {
                    result = false;
                    break check;
                }
                dotIndex = lastString.indexOf(".", dotIndex + 1);

            }
            //檢查@前面條件
            String frontWords = email.substring(0, atIndex);
            for (int i = 0; i < frontWords.length(); i++) {
                char c = frontWords.charAt(i);
                if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z') && !(c >= '0' && c <= '9') && (c != '.') && (c != '-')) {
                    result = false;
                    break check;
                }
            }
            //頭尾不能.
            if (frontWords.startsWith(".") || frontWords.endsWith(".")) {
                result = false;
            }
        }
        //全部轉換為小寫
        email = email.toLowerCase();
        if (result) {
            System.out.println("您好，您輸入正確。輸入的Ｅ-mail為：" + email);
        }else{
            System.out.println("您輸入錯誤的格式");
        }
    }
}




import java.util.Scanner;

//        接收輸入一個身份證字號，檢查是否符合下列規則：
//* 共十個字元
//* 第一個字元必須是大寫英文字母。
//* 第二個字元必須是 1 或 2。
//* 第三個字元至第十個字元必須是數字字元。
//* 第一個英文字元依照下方英文字母數字代號表來取得數字代號。
//用數字代號取代原英文字母，得到一個 11 位數之數字。
//將 11 位數的數字拆開成 11 個數字，並分別乘以
//　１，９，８，７，６，５，４，３，２，１，１。
//將上述步驟得到的相乘後的 11 個數字相加。
//若上述步驟得到的加總後的數字是 10 的倍數，即為正確的身份證字號
//若格式正確，輸出正確，否則輸出錯誤。
public class IdCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入身分證字號：");
        String id = sc.next();

        boolean result = true;

        check:
        {
            //共十個字元
            if (id.length() != 10) {
                result = false;
                break check;
            }
            //第一個字元是大寫英文字母
            if (id.charAt(0) < 'A' || id.charAt(0) > 'Z') {
                result = false;
                break check;
            }
            //第二個字元必須是1 或 2。
            if (id.charAt(1) != '1' && id.charAt(1) != '2') {
                result = false;
                break check;
            }
            //第三個字元至第十個字元必須是數字字元。
            for (int i = 2; i < id.length(); i++) {
                if (id.charAt(i) < '0' || id.charAt(i) > '9') {
                    result = false;
                    break check;
                }
            }
//            //數字計算驗證。
//            int change = 0;
//            switch (id.charAt(0)) {
//                case 'A' -> change = 10;
//                case 'B' -> change = 11;
//                case 'C' -> change = 12;
//                case 'D' -> change = 13;
//                case 'E' -> change = 14;
//                case 'F' -> change = 15;
//                case 'G' -> change = 16;
//                case 'H' -> change = 17;
//                case 'J' -> change = 18;
//                case 'K' -> change = 19;
//                case 'L' -> change = 20;
//                case 'M' -> change = 21;
//                case 'N' -> change = 22;
//                case 'P' -> change = 23;
//                case 'Q' -> change = 24;
//                case 'R' -> change = 25;
//                case 'S' -> change = 26;
//                case 'T' -> change = 27;
//                case 'U' -> change = 28;
//                case 'V' -> change = 29;
//                case 'X' -> change = 30;
//                case 'Y' -> change = 31;
//                case 'W' -> change = 32;
//                case 'Z' -> change = 33;
//                case 'I' -> change = 34;
//                case 'O' -> change = 35;
//            }

            //文字轉換
            String s = "ABCDEFGHJKLMNOPQRSTUVXYWZIO";
            int number = s.indexOf(id.charAt(0)) + 10;
            id = id.substring(1);
            id = number + id;

            //11個數字相加
            char c = id.charAt(0);
            int temp = (c - 48);

            for (int i = 1; i <= 9; i++) {
                c = id.charAt(i);
                temp += (c - 48) * (10 - i);
            }
            c = id.charAt(10);
            temp += (c - 48);

            //乘加後是10的倍數
            if (temp % 10 != 0) {
                result = false;
            }
        }


        if (result) {
            System.out.println("正確");
        } else {
            System.out.println("錯誤");
        }
    }
}

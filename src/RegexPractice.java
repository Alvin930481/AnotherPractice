import java.util.Scanner;

public class RegexPractice {
    public static void main(String[] args) {
        checkEmail();

    }

    /**
     * 正則表達式驗證手機號碼
     */
    public static void checkPhoneNumber(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("請您輸入手機號碼");
            String phone = sc.next();
            if (phone.matches("09\\d{8}")){
                System.out.println("號碼正確");
                return;
            }else{
                System.out.println("格式錯誤");
            }
        }
    }
    /**
     * 正則表達式驗證電子信箱
     */
    public static void checkEmail(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("請您輸入電子信箱");
            String phone = sc.next();
            if (phone.matches("[\\w\\S]+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]){0,2}")){
                System.out.println("信箱正確");
                return;
            }else{
                System.out.println("格式錯誤");
            }
        }
    }
}

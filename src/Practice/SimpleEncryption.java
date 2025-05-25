package Practice;

public class SimpleEncryption {
    public static void main(String[] args) {
        System.out.println(encryption(3456));

    }


    public static int encryption(int num) {
        int a = num / 1000;
        int b = (num / 100) % 10;
        int c = (num / 10) % 10;
        int d = num % 10;
        num = encryptionMathod(a) + encryptionMathod(b) * 10 + encryptionMathod(c) * 100 + encryptionMathod(d) * 1000;
        return num;
    }

    public static int encryptionMathod(int num) {
        num = (num + 5) % 10;
        return num;
    }
}

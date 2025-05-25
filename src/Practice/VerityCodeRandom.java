package Practice;

import java.util.Random;

public class VerityCodeRandom {
    public static void main(String[] args) {
        System.out.println(createCode(5));
    }


    public static String createCode(int n) {
        Random r = new Random();
        String code = "";
        for (int i = 0; i < n; i++) {
            int type = r.nextInt(3);
            switch (type) {
                case 0:
                    char ch = (char) (r.nextInt(26) + 65);
                    code += ch;
                    break;
                case 1:
                    char chs = (char) (r.nextInt(26) + 97);
                    code += chs;
                    break;
                case 2:
                    code += r.nextInt(10);
                    break;
            }
        }
        return code;
    }
}

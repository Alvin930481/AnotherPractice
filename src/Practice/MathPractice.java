package Practice;

public class MathPractice {
    public static void main(String[] args) {
        System.out.println("質數有：");
        for (int i = 101; i < 201; i++) {
            for (int j = 2; j < (i / 2); j++) {
                if (i % j == 0) {
                    break;
                } else if (j == (i / 2) - 1) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}

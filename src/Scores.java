import java.util.Scanner;

public class Scores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        int[] scores = new int[5];
        int stamp = 0;
        while (number != 6) {
            System.out.print("請選擇您要做的動作：1.輸入分數  2.顯示全部分數  3.顯示最高分  4.顯示最低分  5.高至低排序  6.離開 ：");
            number = sc.nextInt();
            switch (number) {
                case 1:
                    //輸入所有人分數
                    for (int i = 0; i < scores.length; i++) {
                        System.out.print("請輸入第" + (i + 1) + "位分數： ");
                        scores[i] = sc.nextInt();
                    }
                    //旗標
                    stamp =1;
                    break;

                case 2:
                    //要先進行分數輸入
                    if(stamp != 1 ){
                        System.out.println("請先輸入分數");
                        continue;
                    }
                    //輸出所有人分數
                    for (int i = 0; i < scores.length; i++) {
                        System.out.print(scores[i] + "  ");
                    }
                    System.out.println();
                    break;

                case 3: {
                    //要先進行分數輸入
                    if(stamp != 1 ){
                        System.out.println("請先輸入分數");
                        continue;
                    }
                    //顯示最高分
                    int highest = scores[0];
                    for (int i = 1; i < scores.length; i++) {
                        if (highest < scores[i]) {
                            highest = scores[i];
                        }
                    }
                    System.out.println(highest);
                    break;
                }
                case 4:
                    //要先進行分數輸入
                    if(stamp != 1 ){
                        System.out.println("請先輸入分數");
                        continue;
                    }
                    //顯示最低分
                    int lowestIndex = 0;
                    for (int i = 1; i < scores.length; i++) {
                        if (scores[lowestIndex] > scores[i]) {
                            lowestIndex = i;
                        }
                    }
                    System.out.println(scores[lowestIndex]);
                    break;
                case 5: {
                    //要先進行分數輸入
                    if(stamp != 1 ){
                        System.out.println("請先輸入分數");
                        continue;
                    }
                    //排序
                    //重複換位置>>排序
                    for (int j = 0; j < scores.length-1; j++) {
                        //找最大值索引
                        int highestIndex = j;
                        for (int i = j + 1; i < scores.length; i++) {
                            if (scores[highestIndex] < scores[i]) {
                                highestIndex = i;
                            }
                        }
                        //換位置
                        int tep = scores[j];
                        scores[j] = scores[highestIndex];
                        scores[highestIndex] = tep;
                    }
                    for (int i = 0; i < scores.length; i++) {
                        System.out.print(scores[i] + "  ");
                    }
                    System.out.println();
                    break;
                }
                case 6:
                    System.out.println("感謝使用");
                default:
                    System.out.println("您輸入的資訊錯誤");
            }
        }


    }
}


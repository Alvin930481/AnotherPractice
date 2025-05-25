package ArrayListPactice;

import java.util.ArrayList;

public class Score {
    public static void main(String[] args) {
        ArrayList<Integer> score = new ArrayList<>();
//        ArrayList<Integer> remove = new ArrayList<>();
        score.add(98);
        score.add(77);
        score.add(66);
        score.add(89);
        score.add(79);
        score.add(50);
        score.add(100);
        System.out.println(score);
//        //自己想的解法
//        for (int i = 0; i < score.size(); i++) {
//            if(score.get(i)<80){
//                //錯誤解法
////                Integer remove = score.remove(i);
////                System.out.println(remove);
//                remove.add(score.get(i));
//            }
//        }
//        for (int i = 0; i < remove.size(); i++) {
//            score.remove(remove.get(i));
//        }
//        //經典解法，刪除後減一
//        for (int i = 0; i < score.size(); i++) {
//            if (score.get(i) < 80) {
//                score.remove(i);
//                i--;
//            }
//        }

        //第三種解法，可以從後面開始刪除
        for (int i = score.size() - 1; i >= 0; i--) {
            if (score.get(i) < 80) {
                score.remove(i);
            }
        }

        System.out.println(score);
    }
}

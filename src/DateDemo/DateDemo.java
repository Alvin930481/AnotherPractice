package DateDemo;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        long time = d.getTime();
        System.currentTimeMillis();
        System.out.println(time);

        System.out.println("---------------------------------");
        //計算現在時間加上一小時121秒後時間
        long time2 = System.currentTimeMillis();
        time2 += (60 * 60 + 121) * 1000;

        Date d2 = new Date(time2);
        System.out.println(d2);
    }
}

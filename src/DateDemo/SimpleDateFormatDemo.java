package DateDemo;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        System.out.println(d);
        //格式化時間（自己做喜歡的格式）
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 a HH:mm:ss EEEE ");

        //使用格式化的時間
        String rs = sdf.format(d);
        System.out.println(rs);

        //時間毫秒值也可以轉換
        rs = sdf.format(System.currentTimeMillis() + 121 * 1000);
        System.out.println(rs);

        System.out.println("-------------------------");
        //解析時間案例，把下列時間加上2天14小時49分06秒
        String dateStr = "2021年08月06日 11:11:11";

        //解析：形式必須與被解析形式必須完全一樣
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date d2 = sdf2.parse(dateStr);
        System.out.println(d2);
        //加上時間
        long d3 = d2.getTime()+ (2L*24*60*60 + 14*60*60+49*60 + 6)*1000;
        //輸出同格式時間
        System.out.println(sdf2.format(d3));
    }
}

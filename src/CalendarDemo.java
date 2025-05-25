import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
    public static void main(String[] args) {
        //1.新創一個日曆物件
        Calendar cal=Calendar.getInstance();
        System.out.println(cal);

        //2.得到日曆的訊息：或去日期中的某個訊息
        int year = cal.get(Calendar.YEAR);
        System.out.println(year+"年");

        int mm = cal.get(Calendar.MONTH);
        System.out.println(mm+1+"月");

        int dd= cal.get(Calendar.DATE);
        System.out.println(dd+"日");

        //修改(一般來說不改)
        cal.set(Calendar.HOUR, 12);

        //64天候什麼時間
        cal.add(Calendar.DAY_OF_YEAR,64);

        //拿到此刻日期時間
        Date d = cal.getTime();
        System.out.println(d);
    }
}

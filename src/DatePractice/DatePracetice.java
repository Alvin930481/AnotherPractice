package DatePractice;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePracetice {
    public static void main(String[] args) throws ParseException {
        String startTime = "2020年11月11日 0:0:0";
        String endTime = "2020年11月11日 0:10:0";

        SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date start1 = timeFormat.parse(startTime);
        long start11=start1.getTime();
        Date end1 = timeFormat.parse(endTime);
        long end11=end1.getTime();

        String paytime1="2020年11月11日 0:3:47";
        Date paytime11= timeFormat.parse(paytime1);
        long paytime111=paytime11.getTime();

        String paytime2="2020年11月11日 0:10:11";
        Date paytime22= timeFormat.parse(paytime2);
        long paytime222=paytime22.getTime();

        if(paytime111>=start11 && paytime111<=end11){
            System.out.println("小賈 有買到品項");
        }else {
            System.out.println("小賈 失望而回");
        }

        if(paytime222>=start11 && paytime222<=end11){
            System.out.println("小皮 有買到品項");
        }else {
            System.out.println("小皮 失望而回");
        }
    }
}

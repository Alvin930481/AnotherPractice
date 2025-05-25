import java.util.Scanner;

public class Practice_01_Week {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("please input a number of startDay: ");
        int  startDay= keyboard.nextInt();
        System.out.print("please input a number of days to calculate: ");
        int number = keyboard.nextInt();



        int theDay = startDay + number % 7;
        theDay %= 7;
        //System.out.println("Today is " + theDay );
        String strDay = "";
        switch (theDay){
            case 0:
                strDay = "Sunday";
                break;
            case 1:
                strDay = "Monday";
                break;
            case 2:
                strDay = "Tuesday";
                break;
            case 3:
                strDay = "Wednesday";
                break;
            case 4:
                strDay = "Thursday";
                break;
            case 5:
                strDay = "Friday";
                break;
            case 6:
                strDay = "Saturday";
                break;
        }
        System.out.println(strDay);
        }

}
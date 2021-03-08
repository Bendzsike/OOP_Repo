package labor2_3;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random rand = new Random();
//        System.out.println(DateUtil.isValidDate(2000,2, 29) == true);
//        System.out.println(DateUtil.isValidDate(2000,2, 30) == false);
//        System.out.println(DateUtil.isValidDate(1900,2, 29) == false);
//        System.out.println(DateUtil.isValidDate(1900,2, 28) == true);
//        System.out.println(DateUtil.isValidDate(-1900,2, 28) == false);
//        System.out.println(DateUtil.isValidDate(0,2, 28) == false);
//        System.out.println(DateUtil.isValidDate(2021,2, 29) == false);
//        System.out.println(DateUtil.isValidDate(2020,2, 29) == true);
//        System.out.println(DateUtil.isValidDate(2020,1, 32) == false);
//        System.out.println(DateUtil.isValidDate(2020,1, 0) == false);
//        System.out.println(DateUtil.isValidDate(2020,0, 0) == false);
//        System.out.println(DateUtil.isValidDate(2020,4, 31) == false);

        MyDate[] dates = new MyDate[1000];
        int invalid = 0;
        for(int i = 0; i < 1000; ++i){
            int year = -1000 + rand.nextInt(3000);
            int month = 1 + rand.nextInt(30);
            int day = 1 + rand.nextInt(50);
            dates[i] = new MyDate(year, month, day);
            if(DateUtil.isValidDate(dates[i].getYear(), dates[i].getMonth(), dates[i].getDay()) == true){
                System.out.println(dates[i].toString());
            } else{
                System.out.println(dates[i].toString() + "INVALID");
                ++invalid;
            }
        }
        System.out.println("Invalid dates generated: " + invalid);
    }
}

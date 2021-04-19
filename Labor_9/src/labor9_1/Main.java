package labor9_1;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<MyDate> dates = new ArrayList<>();
        for(int i = 0; i < 10; ++i) {
            int month = rand.nextInt(12);
            int day = rand.nextInt(31);
            dates.add(new MyDate(2021, month, day));
        }
        for(MyDate date : dates) {
            System.out.println(date);
        }
        for(int i = 0; i < 10; ++i) {
            for(int j = 0; j < 10; ++j) {
                if(dates.get(j).compareTo(dates.get(i)) > 0) {
                    MyDate temp = dates.get(j);
                    dates.set(j, dates.get(i));
                    dates.set(i, temp);
                }
            }
        }
        System.out.println("Sorted:");
        for(MyDate date : dates) {
            System.out.println(date);
        }
    }
}

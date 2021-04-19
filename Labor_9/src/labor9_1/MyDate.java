package labor9_1;

public class MyDate implements Comparable<MyDate> {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day){
        if(!DateUtil.isValidDate(year, month, day)){
            return;
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String toString(){
        return year + ". " + month + ". " + day + ".";
        //return date;
    }

    @Override
    public int compareTo(MyDate date) {
        if(this.year != date.year) {
            return this.year - date.year;
        }
        if(this.month != date.month) {
            return this.month - date.month;
        }
        if(this.day != date.day) {
            return this.day - date.day;
        }
        return 0;
    }
}

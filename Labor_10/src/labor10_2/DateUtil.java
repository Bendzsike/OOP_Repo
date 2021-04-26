package labor10_2;

public class DateUtil {
    public static boolean leapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static boolean isValidDate(int year, int month, int day){
        if(year <= 0 || month <= 0 || day <= 0){
            return false;
        }
        if(month == 2){
            if(leapYear(year) && day <= 29){
                return true;
            } else if(day <= 28){
                return true;
            }
            return false;
        }
        if((month < 8 && (month % 2 == 1)) || (month > 7 && (month % 2 == 0))){
            if(day <= 31){
                return true;
            }
            return false;
        }
        if(day <= 30){
            return true;
        }
        return false;
    }
}

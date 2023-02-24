public class DaysBetweenTwoDates {
    public static void main(String[] args) {
        int daysBetween = daysBetweenDates("01-02-1890", "09-01-1880");
        System.out.println(daysBetween);
    }

    static final int[] DAYS_IN_A_MONTH = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};

    static int daysToDate(String date) {
        String[] dateArr = date.split("-");
        int d = Integer.parseInt(dateArr[0]);
        int m = Integer.parseInt(dateArr[1]);
        int y = Integer.parseInt(dateArr[2]);

        int daysPast = (y - 1) * 365;
        daysPast += DAYS_IN_A_MONTH[m - 1];
        daysPast += d;

        if (isLeapYear(y)) {
            daysPast++;
        }

        daysPast = daysPast + leapYears(y);

        return daysPast;
    }

    static int leapYears(int year) {
        int leapDays = year / 4;
        int leapDay100 = year / 100;
        int leapDay400 = year / 400;

        return leapDays - leapDay100 + leapDay400;
    }

    static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 400 == 0) {
            return year % 100 != 0 ? false : true;
        }
        return false;
    }

    /**accurate only for dates in the same century**/
    static int daysBetweenDates(String date1, String date2) {
        int date1Days = daysToDate(date1);
        int date2Days = daysToDate(date2);

        return date1Days < date2Days ? date2Days - date1Days : date1Days - date2Days;
    }
}
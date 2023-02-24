public class DayOfTheWeek {
    static final int[] DAYS_IN_A_MONTH = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
    static final int DAY_OFFSET = 4;

    public static void main(String[] args) {
        System.out.println(dayOfTheWeek("09-08-2022"));
        System.out.println(dayOfTheWeek("04-03-2002"));
        System.out.println(dayOfTheWeek("5-10-2015"));
        System.out.println(dayOfTheWeek("12-12-2012"));
    }

    static int dayOfTheWeek(String date) {
        String[] dateArr = date.split("-");
        int d = Integer.parseInt(dateArr[0]);
        int m = Integer.parseInt(dateArr[1]);
        int y = Integer.parseInt(dateArr[2]);

        int daysPast = (y - 1) * 365;
        daysPast += DAYS_IN_A_MONTH[m - 1];
        daysPast += d;

        if (y > 1582) {
            daysPast -= 11;
        }

        if (y % 4 == 0 && m > 2) {
            daysPast++;
        }

        daysPast = daysPast + leapYears(y) + DAY_OFFSET;

        return daysPast % 7;
    }

    static int leapYears(int year) {
        int leapDays = year / 4;
        int leapDay100 = year / 100;
        int leapDay400 = year / 400;

        return leapDays - leapDay100 + leapDay400;
    }
}

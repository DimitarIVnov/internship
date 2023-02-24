public class ValidDate {
    final static int[] DAYS_IN_A_MONTH = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean validDate(String date) {
        String[] strArr = date.split("-");
        int[] dateArr = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            dateArr[i] = Integer.parseInt(strArr[i]);
        }

        int day = dateArr[0];
        int month = dateArr[1];
        int year = dateArr[2];

        if (month > 12 || month < 1 || year < 0) {
            return false;
        }

        if (day > DAYS_IN_A_MONTH[month - 1]) {
            return false;
        }

        if (month == 2 && day == 29 && !isLeapYear(year)) {
            return false;
        }

        return true;
    }

    private static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 400 == 0) {
                return true;
            }
            if (year % 100 == 0) {
                return false;
            }
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        boolean bool1 = validDate("12-12-2012");
        System.out.println(bool1);

        boolean bool2 = validDate("30-02-2012");
        System.out.println(bool2);
    }
}

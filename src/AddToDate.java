public class AddToDate {

    static String addToDate(String date, int n) {
        String[] strArr = date.split("-");
        int[] dateArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            dateArr[i] = Integer.parseInt(strArr[i]);
        }
        int day = dateArr[0];
        int month = dateArr[1];
        int year = dateArr[2];

        int daysInMonth = 30;
        if (month == 2 && isLeapYear(year)) {
            daysInMonth = 29;
        } else if (month == 2) {
            daysInMonth = 28;
        } else if (month % 2 == 0) {
            daysInMonth = 31;
        }

        int addToMonth = (day + n) / daysInMonth;
        if (day + n > daysInMonth) {
            day--;
        }
        day = (day + n) % daysInMonth;

        if (month + addToMonth > 12) {
            month = addToMonth % 12;
            year += addToMonth / 12 + 1;
        } else {
            month += addToMonth;
        }
        dateArr[0] = day;
        dateArr[1] = month;
        dateArr[2] = year;

        StringBuilder resultStr = new StringBuilder(6);
        for (int i = 0; i < 3; i++) {
            if (dateArr[i] < 10) {
                resultStr.append("0");
            }
            resultStr.append(dateArr[i]);
            resultStr.append("-");
        }

        int resultLength = resultStr.length();
        resultStr.deleteCharAt(resultLength - 1);
        return resultStr.toString();
    }

    private static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 400 == 0) {
                return true;
            }
            if (year % 100 == 0) {
                return false;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String date1 = "21-02-2021";
        String newDate1 = addToDate(date1, 3);
        System.out.println(newDate1);

        String date2 = "31-12-2021";
        String newDate2 = addToDate(date2, 3);
        System.out.println(newDate2);


    }
}

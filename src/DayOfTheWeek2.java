public class DayOfTheWeek2 {
    public static void main(String[] args) {
        System.out.println(getDayOfTheWeek("30-11-2021"));
    }

    static int getDayOfTheWeek(String date) {
        String[] dateArr = date.split("-");
        int d = Integer.parseInt(dateArr[0]);
        int m = Integer.parseInt(dateArr[1]);
        int y = Integer.parseInt(dateArr[2]);

        int dayOfTheWeek = (int) (d + (m + 1) * 2.6 + y + y / 4 + 6 * y / 100 + y / 400 + 6) % 7 - 1;

        if (dayOfTheWeek == 0) {
            return 7;
        } else {
            return dayOfTheWeek;
        }
    }
}

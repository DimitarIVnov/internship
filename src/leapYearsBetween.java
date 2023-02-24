public class leapYearsBetween {

    /**
     * doesn't include the given years
     **/
    public static int leapYearsBetween(int year1, int year2) {
        int leapYears1 = leapYearsFromStart(year1 - 1);
        int leapYears2 = leapYearsFromStart(year2 + 1);

        return Math.abs(leapYears1 - leapYears2);
    }

    public static int leapYearsFromStart(int year) {
        return year / 4 - year / 100 + year / 400;
    }

    public static void main(String[] args) {
        int leapYearsCount = leapYearsBetween(2020, 2030);
        System.out.println(leapYearsCount);
    }
}

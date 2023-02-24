import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCompare {
    public static boolean before(String date1, String date2) throws ParseException {
        SimpleDateFormat sdformat = new SimpleDateFormat("dd-MM-yyyy");
        Date d1 = sdformat.parse(date1);
        Date d2 = sdformat.parse(date2);
        return d1.compareTo(d2) <= 0;
    }

    public static void main(String[] args) throws ParseException {
        System.out.println(before("12-12-2020", "11-12-2020"));
        System.out.println(before("11-12-2020", "12-12-2020"));
        System.out.println(before("11-12-2020", "12-12-2021"));
    }
}

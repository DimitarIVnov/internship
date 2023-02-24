public class SchoolAttendance {
    public static void main(String[] args) {
        System.out.println(attendance("ООПППППППППОЗ"));
        System.out.println(attendance("ОЗПЗППЗЗПЗПЗПЗ"));
    }

    static boolean attendance(String s1) {
        int absent = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'О') {
                absent++;
                if (absent == 2) {
                    return false;
                }
            } else if (same3Chars(s1, i, 'З')) {
                return false;
            }
        }

        return true;
    }

    static boolean same3Chars(String str, int i, char ch) {
        return  str.charAt(i) == ch && i + 3 < str.length() &&
                str.charAt(i + 1) == ch && str.charAt(i + 2) == ch;
    }
}

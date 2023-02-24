public class SubstringRepetition {
    public static void main(String[] args) {
        System.out.println("abc => "+isRepeating("abc"));
        System.out.println("1212 => "+isRepeating("1212"));
        System.out.println("alaala => "+isRepeating("alaala"));
        System.out.println("alaal => "+isRepeating("alaal"));
        System.out.println("zzzzz => "+isRepeating("zzzzz"));
        System.out.println("acacac => "+isRepeating("acacac"));
        System.out.println("acaca => "+isRepeating("acaca"));
    }
//ab-ab-ab + ab-ab-ab
//abc - ab + abc - ab
    static boolean isRepeating(String str) {
        String strToCheck = str + str;

        if (strToCheck.indexOf(str, 1) < str.length()) {
            return true;
        }

        return false;
    }
}
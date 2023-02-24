import java.util.LinkedList;
import java.util.List;

public class ParseCsv {

    public static String[] parseCsv(String str) {
        int open = 0;
        int close = 0;
        int startWordAt = 0;
        List<String> resultList = new LinkedList<>();
        boolean foundChar = false;
        for (int i = 0; i < str.length(); i++) {
            if (i == str.length() - 1 && str.charAt(i) != ',') {
                resultList.add(str.substring(startWordAt, i + 1));
            } else if (str.charAt(i) == '"' && !foundChar) {
                open++;
            } else if (str.charAt(i) == '"' && foundChar) {
                close++;
            } else if (str.charAt(i) != '"' && str.charAt(i) != ',') {
                foundChar = true;
            } else if (str.charAt(i) == ',') {
                if (close >= open) {
                    resultList.add(str.substring(startWordAt, i));
                    startWordAt = i + 1;
                    foundChar = false;
                    open = 0;
                    close = 0;
                }
            }
        }

        return resultList.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String str1 = "1, 2, ala , bala";
        String[] res1 = parseCsv(str1);
        for (String string : res1) {
            System.out.print(string + " ");
        }
        System.out.println();

        String str2 = "\"hello world\", 1, 2";
        String[] res2 = parseCsv(str2);
        for (String string : res2) {
            System.out.print(string + " ");
        }
        System.out.println();

        String str3 = "ala, 2, 'hello world'";
        String[] res3 = parseCsv(str3);
        for (String string : res3) {
            System.out.print(string + " ");
        }
        System.out.println();

        String str4 = "ala, 2, 'I\'m fine'";
        String[] res4 = parseCsv(str4);
        for (String string : res4) {
            System.out.print(string + " ");
        }
        System.out.println();

        String str5 = "ala, 2, 'c:\\work\\test.log'";
        String[] res5 = parseCsv(str5);
        for (String string : res5) {
            System.out.print(string + " ");
        }
    }
}

public class StringCypher {
    public static void main(String[] args) {
        System.out.println(cypherString("zab", 2));
    }

    static String cypherString(String str, int n) {
        char[] charArr = str.toCharArray();

        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] + n > 'z') {
                charArr[i] = (char) ('a' + str.length() - n);
            } else {
                charArr[i] = (char) (charArr[i] + n);
            }
        }

        return new String(charArr);
    }
}

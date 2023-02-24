public class ReplaceChar {
    public static void main(String[] args) {
        String str = "aaabaaaaaaaabbbbbaababaabab";
        str = replaceChar(str, 'b', 'a');
        System.out.println(str);
    }

    static String replaceChar(String str, char ch, char replacementCh) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                stringBuilder.append(replacementCh);
            } else {
                stringBuilder.append(str.charAt(i));
            }
        }

        return stringBuilder.toString();
    }
}

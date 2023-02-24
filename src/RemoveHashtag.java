public class RemoveHashtag {
    public static void main(String[] args) {
        String str = "a##bc";
        System.out.println(removeHashTag(str));
    }

    static String removeHashTag(String str) {
        char[] strChars = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            if (strChars[i] == '#') {
                int j = 0;
                while (true) {
                    j++;
                    if (i - j < 0) {
                        break;
                    }
                    if (strChars[i - j] != 0 && strChars[i - j] != '#') {
                        strChars[i - j] = 0;
                        break;
                    }

                }
                strChars[i] = 0;
            }
        }

        StringBuilder strBuilder = new StringBuilder(str.length());
        for (char i : strChars) {
            if (i != Character.MIN_VALUE) {
                strBuilder.append(i);
            }
        }
        return str = strBuilder.toString();
    }
}

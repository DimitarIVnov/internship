public class CompareWithoutSpaces {
    static int ENGLISH_ALPHABET_SIZE = 26;
    static int BULGARIAN_ALPHABET_SIZE = 30;

    public static void main(String[] args) {
        System.out.println(compare("  abc  ", "abc"));
        System.out.println(compare("ABC", "abc"));
        System.out.println(compare(" ala   bala", "ala bala"));
        System.out.println(compare(" ала bala  ", "alabala"));

    }

    static boolean[] strToBoolArr(String str) {
        boolean[] boolArr = new boolean[ENGLISH_ALPHABET_SIZE + BULGARIAN_ALPHABET_SIZE];

        for (char i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                continue;
            }
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                boolArr[str.charAt(i) - 'a'] = true;
            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                boolArr[str.charAt(i) - 'A'] = true;
            } else if (str.charAt(i) >= 'а' && str.charAt(i) <= 'я') {
                boolArr[str.charAt(i) - 'а' + ENGLISH_ALPHABET_SIZE] = true;
            } else if (str.charAt(i) >= 'А' && str.charAt(i) <= 'Я') {
                boolArr[str.charAt(i) - 'А' + ENGLISH_ALPHABET_SIZE] = true;
            }

        }
        return boolArr;
    }

    static boolean compare(String s1, String s2) {
        boolean[] str1BoolArr = strToBoolArr(s1);
        boolean[] str2BoolArr = strToBoolArr(s2);

        for (int i = 0; i < ENGLISH_ALPHABET_SIZE + BULGARIAN_ALPHABET_SIZE; i++) {
            if (str1BoolArr[i] != str2BoolArr[i]) {
                return false;
            }
        }

        return true;
    }
}

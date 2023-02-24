public class UniqueChars {

    public static void main(String[] args) {
        System.out.println(uniqueCharacter("ababc", "abcccc"));
        System.out.println(uniqueCharacter("abc", "ab"));
        System.out.println(uniqueCharacter("ababc", "abcccc"));
    }

    static boolean uniqueCharacter(String str1, String str2) {
        boolean[] str1BoolArr = new boolean[26];
        boolean[] str2BoolArr = new boolean[26];

        for (char i = 0; i < str1.length(); i++) {
            str1BoolArr[str1.charAt(i) - 'a'] = true;
        }

        for (char i = 0; i < str2.length(); i++) {
            str2BoolArr[str2.charAt(i) - 'a'] = true;
        }

        for (int i = 0; i < 26; i++) {
            if (str1BoolArr[i] != str2BoolArr[i]) {
                return false;
            }
        }

        return true;
    }
}
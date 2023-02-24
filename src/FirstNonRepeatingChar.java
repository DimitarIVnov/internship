public class FirstNonRepeatingChar {

    static int firstNonRepeatingChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (str.indexOf(currentChar) == str.lastIndexOf(currentChar)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String str1 = "alabala";
        String str2 = "github";
        String str3 = "alabalab";
        System.out.println(firstNonRepeatingChar(str1));
        System.out.println(firstNonRepeatingChar(str2));
        System.out.println(firstNonRepeatingChar(str3));
    }
}
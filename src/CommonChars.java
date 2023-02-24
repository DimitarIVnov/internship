import java.util.HashSet;
import java.util.Set;

public class CommonChars {
    public static void main(String[] args) {
        String newString;
        newString = commonCharsString("abca", "deaf");
        System.out.println(newString);
    }

    static String commonCharsString(String firstString, String secondString) {
        Set<Character> firstStringCharSet = new HashSet<>();
        Set<Character> finalCharSet = new HashSet<>();


        for (int i = 0; i < firstString.length(); i++) {
            firstStringCharSet.add(firstString.charAt(i));
        }
        for (int i = 0; i < secondString.length(); i++) {
            if (firstStringCharSet.contains(secondString.charAt(i))) {
                finalCharSet.add(secondString.charAt(i));
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i : finalCharSet) {
            stringBuilder.append((char) i);
        }
        return stringBuilder.toString();
    }
}

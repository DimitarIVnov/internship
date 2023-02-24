import java.util.HashSet;
import java.util.Set;

public class HW1T1V20 {
    public static void main(String[] args) {
        String newString;
        newString = commonCharsString("asdasasdfgAfhjg", "adAac");
        System.out.println(newString);
    }

    static String commonCharsString(String s1, String s2) {
        HashSet<Character> hs1 = new HashSet<>();
        HashSet<Character> hs2 = new HashSet<>();

        putInSet(hs1, s1);
        putInSet(hs2, s2);
        hs1.retainAll(hs2);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i : hs1) {
            stringBuilder.append((char) i);
        }

        return stringBuilder.toString();
    }

    static void putInSet(HashSet<Character> hs, String str) {
        for (int i = 0; i < str.length(); i++) {
            hs.add(str.charAt(i));
        }
    }
}

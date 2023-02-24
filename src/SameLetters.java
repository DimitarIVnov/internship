import java.util.HashSet;

public class SameLetters {
    public static void main(String[] args) {
        boolean same = sameLetters("aaaacb", "abc");
        System.out.println(same);
    }

    static boolean sameLetters(String s1, String s2) {
        HashSet<Character> set1 = strToHashSet(s1);
        HashSet<Character> set2 = strToHashSet(s2);

        return set1.equals(set2);
    }

    static HashSet<Character> strToHashSet(String str) {
        HashSet<Character> set = new HashSet<>(str.length());
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }

        return set;
    }
}

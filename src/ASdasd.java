import java.util.HashSet;

public class ASdasd {
    public static void main(String[] args) {

    }

    public class SameLetters {
        public static void main(String[] args) {
            boolean same = sameLetters("abc", "ab");
            System.out.println(same);
        }

        static boolean sameLetters(String s1, String s2) {
            HashSet<Character> set = new HashSet<>();

            for (int i = 0; i < s1.length(); i++) {
                set.add(s1.charAt(i));
            }

            int setLength = set.size();
            for (int i = 0; i < s2.length(); i++) {
                set.add(s2.charAt(i));
                if (set.size() != setLength) {
                    return false;
                }
            }

            return true;
        }
    }
}

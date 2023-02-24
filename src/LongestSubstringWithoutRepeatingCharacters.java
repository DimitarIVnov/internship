import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
     // System.out.println(lengthOfLongestSubstring("abcabcbb"));
      System.out.println(lengthOfLongestSubstring("jbpnbwwd"));
    }

    static int lengthOfLongestSubstring(String str) {
        Set<Character> chSet = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            chSet.add(str.charAt(i));
        }

        if (chSet.size() == 1) {
            return 1;
        }

        StringBuilder stringBuilder = new StringBuilder(chSet.size());
        for (int i : chSet) {
            stringBuilder.append((char) i);
        }

        int maxC = 0;
        Set<Character> chSetTemp = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < chSet.size(); j++) {
                if (i + j > str.length() - 1) {
                    break;
                }
//                if (chSetTemp.contains(str.charAt(i + j))) {
//                    break;
//                }
                chSetTemp.add(str.charAt(i + j));

            }
            if (chSetTemp.size() > maxC) {
                maxC = chSetTemp.size();
            }
            chSetTemp.clear();
        }

        return maxC;
    }

}

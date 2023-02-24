public class IndexOf2 {
    public static void main(String[] args) {
        System.out.println(indexOf("0123455455", "455", 4));
    }

    static int indexOf(String s1, String s2, int... fromIndex) {
        if (s1.length() < s2.length()) {
            return -1;
        }
        char[] chArr1 = s1.toCharArray();
        char[] chArr2 = s2.toCharArray();
        int index = fromIndex.length < 1 ? 0 : fromIndex[0] + chArr2.length;


        for (int i = index; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (chArr1[i + j] == chArr2[j] && j == s2.length() - 1) {
                    return i;
                }
            }
        }

        return -1;
    }
}

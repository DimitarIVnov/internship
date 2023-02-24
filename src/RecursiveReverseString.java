public class RecursiveReverseString {
    public static void main(String[] args) {
        String str = "123";
        String reversedString = reverse(str);
        System.out.println(reversedString);
    }

    static String reverse(String str) {
        char[] chArr = str.toCharArray();
        swap(chArr, 0, str.length() - 1);
        return new String(chArr);
    }

    static void swap(char[] chArr, int i, int j) {
        if (i < j) {
            char temp = chArr[i];
            chArr[i] = chArr[j];
            chArr[j] = temp;
            swap(chArr, ++i, --j);
        }
    }
}

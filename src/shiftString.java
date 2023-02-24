public class shiftString {
    public static void main(String[] args) {
        System.out.println(cipherString("zab", 2));
    }

    static String cipherString(String str, int n) {
        char[] charArr = str.toCharArray();
        char[] shiftedArr = new char[charArr.length];

        for (int i = 0; i < charArr.length; i++) {
            if (i + n >= charArr.length) {
               shiftedArr[(n+i)-charArr.length] = charArr[i];
            } else {
               shiftedArr[i+n] = charArr[i];
            }
        }

        return new String(shiftedArr);
    }
}

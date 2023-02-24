public class MixLettersAndNumbers {
    public static void main(String[] args) {
        String str1 = mixLettersAndNumber("abc133d");
        String str2 = mixLettersAndNumber("alabala");
        System.out.println(str1);
        System.out.println(str2);
    }

    static String mixLettersAndNumber(String str) {
        char[] mixedArr = str.toCharArray();
        char[] charsArr = new char[mixedArr.length];
        char[] numsArr = new char[mixedArr.length];
        int charsCount = 0;
        int numsCount = 0;

        for (int i = 0; i < mixedArr.length; i++) {
            if (mixedArr[i] >= 'a') {
                charsArr[charsCount] = mixedArr[i];
                charsCount++;
            } else {
                numsArr[numsCount] = mixedArr[i];
                numsCount++;
            }
        }

        if (charsCount - numsCount < 0) {
            return "";
        }

        charsCount = 0;
        numsCount = 0;
        char[] sortedChars = new char[mixedArr.length];
        for (int i = 0; i < charsArr.length; i++) {
            if (i % 2 == 0) {
                sortedChars[i] = charsArr[charsCount];
                charsCount++;
            } else {
                sortedChars[i] = numsArr[numsCount];
                numsCount++;
            }
        }
        return new String(sortedChars);
    }
}

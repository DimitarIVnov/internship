public class RomanToInt {
    public static void main(String[] args) {
        System.out.println(RomanToInt("III"));
    }

    static int RomanToInt(String s) {

        int[] charToIntArr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I':
                    charToIntArr[i] = 1;
                    break;
                case 'V':
                    charToIntArr[i] = 5;
                    break;
                case 'X':
                    charToIntArr[i] = 10;
                    break;
                case 'L':
                    charToIntArr[i] = 50;
                    break;
                case 'C':
                    charToIntArr[i] = 100;
                    break;
                case 'D':
                    charToIntArr[i] = 500;
                    break;
                case 'M':
                    charToIntArr[i] = 1000;
                    break;
            }
        }
        int RtoI = 0;
        for (int i = 0; i < charToIntArr.length ; i++) {
            if (i + 1 < charToIntArr.length && charToIntArr[i] < charToIntArr[i + 1]) {
                RtoI -= charToIntArr[i];
            } else {
                RtoI += charToIntArr[i];
            }
        }
        return RtoI;
    }
}

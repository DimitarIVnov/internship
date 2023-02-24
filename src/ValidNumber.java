public class ValidNumber {
    static boolean isValidNum(char num) {
        if (num >= '0' && num <= '9') {
            return true;
        } else if (num == '.' || num == 'e') {
            return true;
        }
        return false;
    }

    static boolean isNumber(String str) {
        boolean dotFlag = false;
        boolean eFlag = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '.') {
                if (!dotFlag) {
                    dotFlag = true;
                } else {
                    return false;
                }
            }
            if (str.charAt(i) == 'e') {
                if (!eFlag) {
                    eFlag = true;
                } else {
                    return false;
                }
            }
            if (!isValidNum(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isNumber("0"));
        System.out.println(isNumber("0.1252"));
        System.out.println(isNumber("abc"));
        System.out.println(isNumber("1 2"));
        System.out.println(isNumber("2e10"));
        System.out.println(isNumber("1.234e2"));
        System.out.println(isNumber("1.2e2.5"));

    }

}

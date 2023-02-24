public class ValidFloat {
    static boolean isValidChar(char ch) {
        return (ch >= '0' && ch <= '9') || ch == '-' || ch == '+' || ch == '.';
    }

    static boolean isFloat(String numStr) {
        char firstCh = numStr.charAt(0);
        if (!(firstCh == '-' || firstCh == '+' ||
                firstCh == '.' || isValidChar(firstCh))) {
            return false;
        }

        char lastCh = numStr.charAt(numStr.length() - 1);
        if (lastCh == '.' || !isValidChar(lastCh)) {
            return false;
        }

        boolean dotFlag = false;
        boolean eFlag = false;
        for (int i = 1; i < numStr.length() - 1; i++) {
            char currentCh = numStr.charAt(i);
            if (currentCh == '.' && !dotFlag) {
                dotFlag = true;
            } else if (currentCh == '.' && dotFlag) {
                return false;
            }

            if (currentCh == 'e' && !eFlag) {
                eFlag = true;
                if (numStr.charAt(i + 1) == '-') {
                    i++;
                }
            } else if (currentCh == 'e' && eFlag) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("0.1       => " + isFloat("0.1"));
        System.out.println(".3        => " + isFloat(".3"));
        System.out.println("-0.1      => " + isFloat("-0.1"));
        System.out.println("0.1.1     => " + isFloat("0.1.1"));
        System.out.println("+0.1      => " + isFloat("+0.1"));
        System.out.println("abc       => " + isFloat("abc"));
        System.out.println("1 a       => " + isFloat("1 a"));
        System.out.println("2e10      => " + isFloat("2e10"));
        System.out.println("1.234e2   => " + isFloat("1.234e2"));
        System.out.println("1.234e-2  => " + isFloat("1.234e-2"));
        System.out.println("+1.234e-2 => " + isFloat("+1.234e-2"));
        System.out.println("1.2e2.5   => " + isFloat("1.2e2.5"));
        System.out.println("1.2e5e3   => " + isFloat("1.2e5e3"));
        System.out.println("1.2e      => " + isFloat("1.2e"));
        System.out.println("e5        => " + isFloat("e5"));


        Logger lg = new Logger("asc");

    }
}

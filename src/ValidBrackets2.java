public class ValidBrackets2 {
    public static void main(String[] args) {
//        String str1 = "()";
//        boolean bool1 = areClosingBrackets(str1);
//        System.out.println(bool1);
//
//        String str2 = "()[]{}";
//        boolean bool2 = areClosingBrackets(str2);
//        System.out.println(bool2);
//
//        String str3 = "(]";
//        boolean bool3 = areClosingBrackets(str3);
//        System.out.println(bool3);

        String str4 = "([)]";
        boolean bool4 = areClosingBrackets(str4);
        System.out.println(bool4);
//
//        String str5 = "{[ ]}";
//        boolean bool5 = areClosingBrackets(str5);
//        System.out.println(bool5);
    }

    static boolean areClosingBrackets(String brackets) {
        int openNormalBracketsOpenCount = 0;
        int openSquareBracketsCount = 0;
        int openCurlyBrackets = 0;
        int closingNormalBracketsCount = 0;
        int closingSquareBracketsCount = 0;
        int closingCurlyBrackets = 0;

        for (int i = 0; i < brackets.length(); i++) {
            switch (brackets.charAt(i)) {
                case '(':
                    openNormalBracketsOpenCount++;
                    break;
                case '[':
                    openSquareBracketsCount++;
                    break;
                case '{':
                    openCurlyBrackets++;
                    break;
                case ')':
                    closingNormalBracketsCount++;
                    break;
                case ']':
                    closingSquareBracketsCount++;
                    break;
                case '}':
                    closingCurlyBrackets++;
                    break;
            }
        }

        return  openNormalBracketsOpenCount - closingNormalBracketsCount == 0 &&
                openSquareBracketsCount - closingSquareBracketsCount == 0 &&
                openCurlyBrackets - closingCurlyBrackets == 0;
    }
}

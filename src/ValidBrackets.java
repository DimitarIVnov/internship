import java.util.Stack;

public class ValidBrackets {
    public static void main(String[] args) {
        String str1 = "()";
        boolean bool1 = areClosingBrackets(str1);
        System.out.println(bool1);

        String str2 = "()[]{}";
        boolean bool2 = areClosingBrackets(str2);
        System.out.println(bool2);

        String str3 = "(]";
        boolean bool3 = areClosingBrackets(str3);
        System.out.println(bool3);

        String str4 = "([)]";
        boolean bool4 = areClosingBrackets(str4);
        System.out.println(bool4);

        String str5 = "{ [ ]}";
        boolean bool5 = areClosingBrackets(str5);
        System.out.println(bool5);
    }

    static boolean areClosingBrackets(String bracketsString) {
//        if (bracketsString.length() % 2 != 0) {
//            return false;
//        }

        Stack<Character> bracketStack = new Stack<>();

        for (int i = 0; i < bracketsString.length(); i++) {
            switch (bracketsString.charAt(i)) {
                case '(':
                    bracketStack.push(')');
                    break;
                case '[':
                    bracketStack.push(']');
                    break;
                case '{':
                    bracketStack.push('}');
                    break;
                case ' ':
                    break;
                default:
                    if (bracketStack.isEmpty() || bracketsString.charAt(i) != bracketStack.peek()) {
                        return false;
                    } else {
                        bracketStack.pop();
                    }
            }
        }

        return bracketStack.isEmpty();
    }
}

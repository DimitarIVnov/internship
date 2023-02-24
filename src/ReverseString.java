import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = reverseString(str);
        System.out.println(str);
    }

    public static String reverseString(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            char currentChar = str.charAt(i);
            stringBuilder.append(currentChar);
        }

        return stringBuilder.toString();
    }

}

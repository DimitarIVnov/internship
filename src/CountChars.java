import java.util.Scanner;

public class CountChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        countChars(str);
    }

    public static void countChars(String str) {
        int letters = 0;
        int digits = 0;
        int spaces = 0;
        int specialSymbols = 0;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (Character.isLetter(currentChar)) {
                letters++;
            } else if (Character.isDigit(currentChar)) {
                digits++;
            } else if (currentChar == ' ') {
                spaces++;
            } else {
                specialSymbols++;
            }
        }

        System.out.println("Letters : " + letters);
        System.out.println("Digits : " + digits);
        System.out.println("Spaces : " + spaces);
        System.out.println("Special symbols : " + specialSymbols);
    }
}

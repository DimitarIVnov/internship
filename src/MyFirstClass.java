import java.util.Scanner;

public class MyFirstClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        sc.nextLine();
        String dateOfBirth = sc.nextLine();
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Date of Birth : " + dateOfBirth);

    }
}

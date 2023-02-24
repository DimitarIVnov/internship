import java.util.Scanner;

public class MoneyClass {
    final static float PERCENT = 0.02f;

    private double money;

    public MoneyClass() {
        Scanner sc = new Scanner(System.in);
        this.money = sc.nextDouble();
    }

    public double calculate() {
        return money * (1 + PERCENT);
    }

}

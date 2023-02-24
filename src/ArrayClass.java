import java.util.Scanner;

public class ArrayClass {
    private static final int MAX_LENGTH = 5;
    private int[] array;
    int sum; // много голяма глупост

    public ArrayClass() {
        this.array = new int[MAX_LENGTH]; 
        this.sum = 0;
        if (array == null) {
            System.exit(MAX_LENGTH);
        }
    }

    public void inputArray() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

    }

    public void sumArray() {
        sum = 0;
        for (int num : array) {
            sum += num;
        }
    }

    public void printResult(){
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) { // може в отделен клас ама е все тая
     ArrayClass ac = new ArrayClass();
     ac.inputArray();
     ac.sumArray();
     ac.printResult();
    }
}

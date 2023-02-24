import java.util.stream.Stream;

public class FibonacciStream {
    static void generateFibonacci(int n) {
        Stream.iterate(new long[]{1, 1}, last2Numbers -> new long[]{last2Numbers[1], last2Numbers[0] + last2Numbers[1]})
                .limit(n)
                .forEach(p -> System.out.println(p[0]));
    }

    public static void main(String[] args) {
       generateFibonacci(10);
    }
}

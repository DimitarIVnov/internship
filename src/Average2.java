public class Average2 {
    private final int[] numbers;
    private int index = 0;
    private float sum = 0;

    public Average2(int maxNumberCount) {
        numbers = new int[maxNumberCount];
    }

    public float next(int number) {
        int currentIndex = index % numbers.length;
        index++;
        sum += number - numbers[currentIndex];
        numbers[currentIndex] = number;

        int numberCount = index < number ? index : numbers.length;
        return sum / numberCount;
    }

    public static void main(String[] args) {
        Average2 avg = new Average2(3);

        float val = avg.next(1);
        System.out.println("next 1 => " + val);
        val = avg.next(2);
        System.out.println("next 2 => " + val);
        val = avg.next(3);
        System.out.println("next 3 => " + val);
        val = avg.next(4);
        System.out.println("next 4 => " + val);
        val = avg.next(5);
        System.out.println("next 5 => " + val);
        val = avg.next(0);
        System.out.println("next 0 => " + val);
    }
}


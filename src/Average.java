import java.util.ArrayList;

public class Average {
    private ArrayList<Integer> listOfElements = new ArrayList<>();
    private int n = 1;

    public Average(int n) {
        this.n = n == 0 ? 1 : n;
        listOfElements = new ArrayList<>();
    }
//
//    public Average() {
//        this(1);
//    }

    float next(int nextNum) {
        listOfElements.add(nextNum);
        int lastNumbersCount = Math.min(n, listOfElements.size());
        float avg = 0;

        for (int i = listOfElements.size() - lastNumbersCount; i < listOfElements.size(); i++) {
            avg += listOfElements.get(i);
        }

        return avg / lastNumbersCount;
    }

    public static void main(String[] args) {

        Average avg = new Average(3);

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

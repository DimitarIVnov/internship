import java.util.Arrays;

public class Largest {
    int k = 0;
    int[] arr;
    int arrElementsCount = 0;

    public Largest(int k) {
        this.k = k;
        arr = new int[k];
        Arrays.fill(arr, Integer.MIN_VALUE);
    }

    public Integer add(Integer num) {
        if (arrElementsCount < k) {
            putElementInPlace(num);
            arrElementsCount++;
            return null;
        }
        int element = putElementInPlace(num);
        return element > -1 ? null : arr[element];
    }

    private int putElementInPlace(int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < element) {
                arr[i] = element;
                return i;
            }
        }

        return -1;
    }

    //    private void swap(int[] arr, int pos1, int pos2) {
//        int temp = arr[pos1];
//        arr[pos1] = arr[pos2];
//        arr[pos2] = arr[pos1];
//    }
    public static void main(String[] args) {
        Largest data = new Largest(3);
        Integer res = data.add(0); // null
        res = data.add(1); // null
        res = data.add(2); // 0
        res = data.add(1); // 0
        res = data.add(4); // 1
    }
}

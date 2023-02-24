public class SortOdd {
    public static void sortOdd(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                continue;
            }
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] % 2 == 0) {
                    continue;
                }
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 8, 1, 4, 0};
        sortOdd(arr);
        for (int num : arr) {
            System.out.println(num);
        }
    }
}

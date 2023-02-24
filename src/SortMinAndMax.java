public class SortMinAndMax {
    public static void sortMinMax(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int max = arr[i], min = arr[i];
            int indexMax = i, indexMin = i;
            for (int k = i; k <= j; k++) {
                if (arr[k] < min) {
                    min = arr[k];
                    indexMin = k;
                } else if (arr[k] > max) {
                    max = arr[k];
                    indexMax = k;
                }
            }
            swap(arr, i, indexMax);
            //  int index = arr[indexMax] == min ? indexMax : indexMin;
            if (arr[indexMax] == min) {
                indexMin = indexMax;
            }
            swap(arr, j, indexMin);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {-10, -10, 2, 51, 1, 2, 4, -1, 0};
        sortMinMax(arr);
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
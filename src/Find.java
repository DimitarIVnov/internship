public class Find {
    public static int find(int[] arr, int n) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (arr[middle] == n) {
                return middle;
            }
            if (arr[middle] < n) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 5, 12, 25};
        int idx = find(a, 1);
        System.out.println(idx);
        idx = find(a, 0);
        System.out.println(idx);
    }
}


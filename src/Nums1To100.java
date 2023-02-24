public class Nums1To100 {
    public static void main(String[] args) {
        System.out.println(sum1toN(3));
        int[] arr = {-6, -22, 0, -4};
        System.out.println(maxElement(arr));
    }

    static int sum1toN(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        return sum;
    }

    static int maxElement(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }
}

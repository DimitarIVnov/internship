public class SubArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] newArr = subarray(arr, 1, 3);
        for (int i : newArr) {
            System.out.println(i + " ");
        }
    }

    static int[] subarray(int[] arr, int start, int... end) {
        int endIndex = end.length < 1 ? arr.length - 1 : end[0];
        int[] subArr = new int[endIndex + 1 - start];

        for (int i = 0; i < subArr.length; i++) {
            subArr[i] = arr[start + i];
        }

        return subArr;
    }
}

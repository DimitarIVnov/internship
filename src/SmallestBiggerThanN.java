public class SmallestBiggerThanN {
    static public int smallestBiggerThanN(int[] arr, int n) {
        int max = arr[0];
        int result = arr[0];
        boolean changedMaxFlag = false;
        for (int num : arr) {
            if (max > num && max > n) {
                max = num;
                changedMaxFlag = true;
            }
        }
        return changedMaxFlag ? max : Integer.MIN_VALUE;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 6, 2};
        int max1 = smallestBiggerThanN(arr1, 2);
        System.out.println(max1);

        int[] arr2 = {5, 1, 4, 2};
        int max2 = smallestBiggerThanN(arr2, 2);
        System.out.println(max2);
    }
}

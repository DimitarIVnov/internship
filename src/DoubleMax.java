public class DoubleMax {
    public static int doubleMax(int[] arr) {
        int max = arr[0];
        int secondMax = arr[0];
        boolean maxChangeFlag = false;
        for (int num : arr) {
            if (max < num) {
                secondMax = max;
                max = num;
                maxChangeFlag = true;
            }
            if (secondMax * 2 > max) {
                maxChangeFlag = false;
            }

        }

        return maxChangeFlag ? max : Integer.MIN_VALUE;
    }

    public static void main(String[] args) {
        int [] arr1 = {1, 2, 3, 6};
        System.out.println(doubleMax(arr1));

        int[] arr2 = {1, 2, 4, 5};
        System.out.println(doubleMax(arr2));
    }
}

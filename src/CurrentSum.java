public class CurrentSum {
    public static void main(String[] args) {
        int[] arr = {1, 3};
        arr = arrSum(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    static int[] arrSum(int[] arr) {
        int[] sumArr = new int[arr.length];
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            sumArr[i] = currentSum;
        }

        return sumArr;
    }
}

public class Rotate {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        rotate(arr, 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void rotate(int[] arr, int n) {
        int[] shiftedArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (i + n >= arr.length) {
                shiftedArr[(n + i) - arr.length] = arr[i];
            } else {
                shiftedArr[i + n] = arr[i];
            }
        }
        System.arraycopy(shiftedArr,0, arr, 0, shiftedArr.length);
    }
}

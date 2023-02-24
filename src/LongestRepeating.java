import java.util.Arrays;

public class LongestRepeating {
    public static int[] longestRepeating(int[] arr) {
        int maxCount = 0;
        int maxNum = arr[0];
        int count = 1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
                continue;
            }
            if (maxCount < count) {
                maxCount = count;
                maxNum = arr[i];
            }
            count = 1;
        }

        int[] resultArr = new int[maxCount];
        Arrays.fill(resultArr, maxNum);

        return resultArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 8, 12, 2, 2, 2, 4, 7, 7};
        int[] newArr = longestRepeating(arr);
        for (int num : newArr) {
            System.out.println(num);
        }
    }
}

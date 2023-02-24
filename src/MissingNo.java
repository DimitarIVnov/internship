public class MissingNo {
    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 2};
        int missingNumber = findMissingNum(arr);
        System.out.println(missingNumber);
    }

    static int findMissingNum(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        int sumMissingNum = 0;

        for (int num : arr) {
            sumMissingNum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        int sumOrdered = (max * (max + 1)) / 2 - (min * (min + 1)) / 2;

        return sumOrdered - sumMissingNum;
    }
}


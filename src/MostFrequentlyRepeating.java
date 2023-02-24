public class MostFrequentlyRepeating {
    public static int mostFrequent(int[] arr) {
        int maxCount = 0;
        int mostFrequent = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count == maxCount) {
                maxCount = Math.min(mostFrequent, arr[i]);
                mostFrequent = arr[i];
            } else if (count > maxCount) {
                maxCount = count;
                mostFrequent = arr[i];
            }
        }

        return mostFrequent;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 5, 3, 7, 9, 5, 3, 7};
        System.out.println(mostFrequent(arr1));

        int[] arr2 = {2, 1, 2, 1};
        System.out.println(mostFrequent(arr2));
    }
}


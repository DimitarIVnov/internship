public class SortElementsByFrequency1 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 8, 12, 2, 2, 2, 4, 7, 7} ;
        int[] newarr = sortByFrequency(arr);
        for (int i : newarr) {
            System.out.println(i);
        }
    }

    static int[] sortByFrequency(int[] arr) {
        int[] arrOTo100 = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arrOTo100[arr[i]]++;
        }

        int sortedArr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int max = 0;
            int maxIndex = 0;
            for (int j = 0; j < arr.length; j++) {
                if (max < arrOTo100[arr[i]]) {
                    max = arr[i];
                    maxIndex = j;
                }
            }
            sortedArr[i] = max;
            arrOTo100[maxIndex] = Integer.MIN_VALUE;
        }
        return sortedArr;
    }

}
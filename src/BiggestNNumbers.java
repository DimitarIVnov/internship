public class BiggestNNumbers {
    public static void main(String[] args) {
        int[] newArr = {1, 8, 0, 6, 3};
        newArr = biggestNNumbers(newArr, 3);
        for (int i : newArr) {
            System.out.println(i);
        }
    }

    static int[] biggestNNumbers(int[] arr, int n) {
        int[] biggerThanNArr = new int[n];
        int biggerElementsCount = 0;
        int max = arr[0];
        int maxIndex = 0;

        int[] arrCpy = new int[arr.length]; //just added
        for (int i = 0; i < arr.length; i++) {
            arrCpy[i] = arr[i];
        }

        for (int i = 0; i < arrCpy.length; i++) {
            for (int j = 0; j < arrCpy.length; j++) {
                if (max < arrCpy[j]) {
                    max = arrCpy[j];
                    maxIndex = j;
                }
            }
            biggerThanNArr[biggerElementsCount] = max;
            arrCpy[maxIndex] = Integer.MIN_VALUE;
            max = arrCpy[0];
            biggerElementsCount++;
            if (biggerElementsCount >= n) {
                return biggerThanNArr;
            }
        }
        return null;
    }
}

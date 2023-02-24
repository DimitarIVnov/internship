public class UniqueSortedArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 5};
        arr = uniqueArr(arr);
        for (int i : arr) {
            System.out.printf("%d ", i);
        }
    }

    static int[] uniqueArr(int[] arr) {
        int[] uniqueElements = new int[arr.length];
        int uniqueElementsCount = 0;

        uniqueElements[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                uniqueElements[uniqueElementsCount] = arr[i];
                uniqueElementsCount++;
            }
        }

        int[] uniqueElementsNo0 = new int[uniqueElementsCount];
        for (int i = 0; i < uniqueElementsCount; i++) {
            uniqueElementsNo0[i] = uniqueElements[i];
        }

        return uniqueElementsNo0;
    }

}

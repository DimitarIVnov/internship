import java.util.Map;
import java.util.TreeMap;

public class SortElementsByFrequency2 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 1, 3, 1, 1};
        int[] newArr = sortByFrequency(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    static int[] sortByFrequency(int[] arr) {
        Map<Integer, Integer> mappedArr = new TreeMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            Integer value = mappedArr.get(arr[i]);
            if (value == null) {
                value = 0;
            }
            mappedArr.put(arr[i], value+1);
        }

        int[] sortedKeysByValue = sortKeysByValue(mappedArr);

        int count = 0;
        for (int i = 0; i < sortedKeysByValue.length; i++) {
            for (int j = 0; j < mappedArr.get(sortedKeysByValue[i]); j++) {
                arr[count] = sortedKeysByValue[i];
                count++;
            }
        }

        return arr;
    }

    private static int[] sortKeysByValue(Map<Integer, Integer> mappedArr) {
        int[] sortedKeysByValue = new int[mappedArr.size()];
        int index = 0;
        for (int i : mappedArr.keySet()) {
            sortedKeysByValue[index] = i;
            index++;
        }

        for (int i = 0; i < sortedKeysByValue.length; i++) {
            for (int j = 0; j < sortedKeysByValue.length; j++) {
                if (mappedArr.get(sortedKeysByValue[j]) < mappedArr.get(sortedKeysByValue[i])) {
                    int temp = sortedKeysByValue[i];
                    sortedKeysByValue[i] = sortedKeysByValue[j];
                    sortedKeysByValue[i] = temp;
                }
            }
        }

        return sortedKeysByValue;
    }
}
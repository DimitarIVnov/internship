import java.util.HashMap;
import java.util.Map;

public class RemoveRepeatingElements2 {
    public static void main(String[] args) {
        int[] newArr = {3, 3, 12, 5, 12, 8, 5};
        newArr = removeRepeatingElements(newArr);
        for (int i : newArr) {
            System.out.print(i + ", ");
        }

    }

    static int[] removeRepeatingElements(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            }
        }
        int[] uniqueArray = new int[map.size()];
        int count = 0;
        for (int value : map.keySet()) {
            uniqueArray[count] = value;
            count++;
        }
        return uniqueArray;
    }
}

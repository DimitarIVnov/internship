import java.util.HashSet;

public class FindPair {
    static int[] findSumElements(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < arr.length; ++i) {
            int temp = target - arr[i];
            if (set.contains(temp)) {
                continue;
            }
            if (set.size() >= 2) {
                break;
            }
            set.add(arr[i]);
        }

        int[] pair = new int[2];
        int index = 0;
        for (Integer num : set) {
            pair[index] = num;
            index++;
        }

        return pair;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 5, 10};
        int[] pair = findSumElements(arr, 10);
        System.out.println(pair[0] + " " + pair[1]); // [1, -1]
    }
}

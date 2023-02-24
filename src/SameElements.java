import java.util.HashSet;

public class SameElements {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5,6};

        System.out.println(sameElements(arr1, arr2));
    }

    static boolean sameElements(int[] arr1, int[] arr2) {
        HashSet<Integer> hs1 = new HashSet<>(arr1.length);
        HashSet<Integer> hs2 = new HashSet<>(arr2.length);

        for (int i : arr1) {
            hs1.add(i);
        }
        for (int i : arr2) {
            hs2.add(i);
        }
        return hs1.equals(hs2);
    }
}

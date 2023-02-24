import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayUniqueElements {
    public static void main(String[] args) {
        int[] arr = {3, 3, 12, 5, 12, 8, 5};
        int[] newArr = uniqueElements(arr);
        for (int i : newArr) {
            System.out.println(i);
        }
    }

    static int[] uniqueElements(int[] arr) {
        Set<Integer> linkedArrSet = new LinkedHashSet<>();

        int[] uniqueArr = new int[linkedArrSet.size()];
        int index = 0;
        for (int n : linkedArrSet) {
            uniqueArr[index] = n;
            index++;
        }

        return uniqueArr;
    }
}

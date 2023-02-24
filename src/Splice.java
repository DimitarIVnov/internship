import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Splice {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        Collections.addAll(a, 1, 2, 3, 4);
        splice(a, 1, 1);
        for (int num : a) {
            System.out.print(num + ", ");
        }
        System.out.println();

        ArrayList<Integer> b = new ArrayList<>();
        Collections.addAll(b, 1, 2, 3, 4);
        splice(b, 1, 2, 5, 6);
        for (int num : b) {
            System.out.print(num + ", ");
        }
        System.out.println();

        ArrayList<Integer> c = new ArrayList<>();
        Collections.addAll(c, 1, 2, 3, 4);
        splice(c, 1);
        for (int num : c) {
            System.out.print(num + ", ");
        }


    }

    static int[] splice(ArrayList<Integer> arr, int start, int deleteCount, int... items) {
        int[] deletedElements = new int[deleteCount - start + 1];
        int j = 0;
        for (int i = start; i < start + deleteCount; i++) {
            deletedElements[j] = arr.get(i);
            j++;
        }
        int itemsIndex = 0;
        for (int i = start; i < arr.size() - items.length - deleteCount; i++) {
            if (i < start + items.length) {
                arr.set(i, items[itemsIndex]);
                itemsIndex++;
            } else if (start + items.length < deleteCount) {
                i += deleteCount - items.length;
            } else if (items.length == 0) {
                arr.set(i, arr.get(i + start));
            } else {
                arr.set(i, arr.get(i));
            }
        }

        return deletedElements;
    }

    static int[] splice(ArrayList<Integer> arr, int start) {
        return splice(arr, start, arr.size() - start);
    }
}
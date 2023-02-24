import java.util.ArrayList;

interface ArrListFilter {
    boolean filter(int e);
}

public class RemoveFromArrayList {


    public static ArrayList remove(ArrayList<Integer> arrayList, ArrListFilter arrListFilter) {
        ArrayList filteredArr = new ArrayList(arrayList.size());
        for (int num : arrayList) {
            if (!arrListFilter.filter(num)) {
                filteredArr.add(num);
            }
        }

        return filteredArr;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        ArrayList<Integer> list = new ArrayList<>(a.length);
        for (int num : a) {
            list.add(num);
        }

        list = RemoveFromArrayList.remove(list, e -> e % 2 == 0);
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}

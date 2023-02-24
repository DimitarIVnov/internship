public class LastIndexOf {
    public static void main(String[] args) {
        Object[] arr = {1, 0, '3', 0, 12, false};
        System.out.println(indexOf(arr, 0, 2));
    }

    static int indexOf(Object[] arr, Object searchElement, int... fromIndex) {
        int index = fromIndex.length < 1 ? 0 : fromIndex[0];
        int lastIndex = -1;

        for (int i = index; i < arr.length; i++) {
            if (arr[i].equals(searchElement)) {
                lastIndex = i;
            }
        }

        return lastIndex;
    }
}

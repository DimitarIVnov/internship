public class indexOfTest {
    public static void main(String[] args) {
        Object[] objectArr = {1, "2", false, "aaaaa", 1};
        System.out.println(indexOf(objectArr, "aaaaa", 2));
    }

    static int indexOf(Object[] arr, Object searchElement, int... args) {
        int n = args.length > 0 ? args[0] : 0;

        for (int i = n; i < arr.length; i++) {
            if (arr[i].equals(searchElement)) {
                return i;
            }
        }
        return -1;
    }
}

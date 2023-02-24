public class Includes {
    public static void main(String[] args) {
        Object[] objectArr = {1, "2", false, "aaaaa", 1};
        System.out.println(includes(objectArr, true, 2));
    }

    static boolean includes(Object[] arr, Object searchElement, int... args) {
        int n = args.length > 0 ? args[0] : 0;

        for (int i = n; i < arr.length; i++) {
            if (arr[i].equals(searchElement)) {
                return true;
            }
        }
        return false;
    }
}


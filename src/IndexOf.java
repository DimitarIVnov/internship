public class IndexOf {
    public static void main(String[] args) {

        int[] newIntArr = {1, 2, 3, 1, 1};
        System.out.println(indexOf(newIntArr, 3, 2));

        String[] newStringArr = {"1", "2", "3", "1", "1"};
        System.out.println(indexOf(newStringArr, "3", 1));

        boolean[] newBoolArr = {true, true, false, false};
        System.out.println(indexOf(newBoolArr, false, 1));
    }

    static int indexOf(int[] arr, int... args) {
        int searchElement = args[0];
        int n = args.length > 1 ? args[1] : 0;

        for (int i = n; i < arr.length; i++) {
            if (arr[i] == searchElement) {
                return i;
            }
        }

        return 0;
    }

    static int indexOf(String[] arr, String searchElement, int... args) {
        int n = args.length > 0 ? args[0] : 0;

        for (int i = n; i < arr.length; i++) {
            if (arr[i].equals(searchElement)) {
                return i;
            }
        }

        return 0;
    }

    static int indexOf(boolean[] arr, boolean searchElement, int... args) {
        int n = args.length > 0 ? args[0] : 0;

        for (int i = n; i < arr.length; i++) {
            if (arr[i] == searchElement) {
                return i;
            }
        }

        return -1;
    }
}

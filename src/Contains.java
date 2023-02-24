public class Contains {
    public static void main(String[] args) {

        int[] newIntArr = {1, 2, 3, 1, 1};
        System.out.println(includes(newIntArr, 5, 2));

        String[] newStringArr = {"1", "2", "3", "1", "1"};
        System.out.println(includes(newStringArr, "4", 1));

        boolean[] newBoolArr = {true, true};
        System.out.println(includes(newBoolArr, false, 1));
    }

    static boolean includes(int[] arr, int... args) {
        int searchElement = args[0];
        int n = args.length > 1 ? args[1] : 0;

        for (int i = n; i < arr.length; i++) {
            if (arr[i] == searchElement) {
                return true;
            }
        }

        return false;
    }

    static boolean includes(String[] arr, String searchElement, int... args) {
        int n = args.length > 0 ? args[0] : 0;

        for (int i = n; i < arr.length; i++) {
            if (arr[i].equals(searchElement)) {
                return true;
            }
        }

        return false;
    }

    static boolean includes(boolean[] arr, boolean searchElement, int... args) {
        int n = args.length > 0 ? args[0] : 0;

        for (int i = n; i < arr.length; i++) {
            if (arr[i] == searchElement) {
                return true;
            }
        }

        return false;
    }
}
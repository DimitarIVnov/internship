public class Shift {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int shiftNum = shift(arr);
        System.out.println("shifted numbe :" + shiftNum);
    }

    static int shift(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        return arr[0];
    }
}

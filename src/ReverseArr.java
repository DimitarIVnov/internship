public class ReverseArr {
    public static void main(String[] args) {
        char[] arr = {'a','b','c','1'};
        reverseArray(arr);
        for (char i : arr) {
            System.out.println(i);
        }
    }

    static void reverseArray(char[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
}

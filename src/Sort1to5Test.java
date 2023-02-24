public class Sort1to5Test {
    public static void main(String[] args) {
        int[] arr = {1, 3, 1, 2, 5, 2, 1, 3};
        sort1to5(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
    static void sort1to5(int[] arr) {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;

        for (int i : arr) {
            switch (i) {
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
                case 3:
                    count3++;
                    break;
                case 4:
                    count4++;
                    break;
                case 5:
                    count5++;
                    break;
            }
        }
        int iterations = 0;
        int iterationsTemp = 0;
        for (int i = 0; i < count1; i++) {
            arr[i] = 1;
            iterationsTemp++;
        }
        iterations = iterationsTemp;
        for (int i = iterations; i < count2 + iterations; i++) {
            arr[i] = 2;
            iterationsTemp++;
        }
        iterations = iterationsTemp;
        for (int i = iterations; i < count3 + iterations; i++) {
            arr[i] = 3;
            iterationsTemp++;
        }
        iterations = iterationsTemp;
        for (int i = iterations; i < count4 + iterations; i++) {
            arr[i] = 4;
            iterationsTemp++;
        }
        iterations = iterationsTemp;
        for (int i = iterations; i < count5 + iterations; i++) {
            arr[i] = 5;
            iterationsTemp++;
        }
    }
}

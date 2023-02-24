public class Task3Test {
    public static void main(String[] args) {
        int[] arr = {1, 3, 1, 2, 5, 2, 1, 3};
        sort1to5(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    static void sort1to5(int[] arr) {
        int[] countArr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 1:
                    countArr[0]++;
                    break;
                case 2:
                    countArr[1]++;
                    break;
                case 3:
                    countArr[2]++;
                    break;
                case 4:
                    countArr[3]++;
                    break;
                case 5:
                    countArr[4]++;
                    break;
            }
        }
        int iterations = 0;
        int iterationsTemp = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if (i - 1 >= 5) {
                return;
            }
            for (int j = iterations; j < iterations + countArr[i - 1]; j++) {
                arr[i - 1] = countArr[i];
                iterationsTemp++;
            }
            iterations = iterationsTemp;
            iterationsTemp = 0;
        }
    }
}


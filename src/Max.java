public class Max {
    public static void main(String[] args) {
        int m1 = max(1);
        System.out.println(m1);

        int m2 = max(1, 2, 3);
        System.out.println(m2);

        int m3 = max(5, -1, 2, 3);
        System.out.println(m3);
    }

    static int max(int m, int... mArr) {
        int max = m;

        for (int num : mArr) {
            if (max < num) {
                max = num;
            }
        }

        return max;
    }
}

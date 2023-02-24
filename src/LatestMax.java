import java.util.Arrays;

public class LatestMax {
    int k;
    int[] buffer;
    int numsCount;

    public LatestMax(int k) {
        this.k = k;
        this.numsCount = 0;
        this.buffer = new int[k];
        Arrays.fill(buffer, Integer.MIN_VALUE);
    }

    public int add(int num) {
        int numPos = numsCount % k;
        buffer[numPos] = num;
        numsCount++;
        return maxNum();
    }

    private int maxNum() {
        int max = buffer[0];
        for (int num : buffer) {
            if (max < num) {
                max = num;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int res;
        LatestMax data = new LatestMax(3);
        res = data.add(1); // 1
        System.out.println("add 1 " + res);
        res = data.add(0); // 1
        System.out.println("add 0 " + res);
        res = data.add(2); // 2
        System.out.println("add 2 " + res);
        res = data.add(1); // 2
        System.out.println("add 1 " + res);
        res = data.add(4); // 4
        System.out.println("add 4 " + res);
        res = data.add(0); // 4
        System.out.println("add 0 " + res);
        res = data.add(0); // 4
        System.out.println("add 0 " + res);
        res = data.add(0); // 0
        System.out.println("add 0 " + res);
    }
}

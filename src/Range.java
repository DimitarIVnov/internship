import java.util.Arrays;
import java.util.LinkedList;

public class Range {
    int start = 0;
    int end = 0;
    int step = 1;
    private int nextNumber;

    Range(int start, int end) {
        this.start = start;
        this.end = end;
    }

    Range(int start, int end, int step) {
        this(start, end);
        this.step = step;
    }

    boolean contains(int n) {
        return n > start && n < end;
    }

    boolean overlaps(Range r) {
        if (this.start > r.start && this.start > r.end) {
            return false;
        } else if (this.end < r.start && this.end < r.end) {
            return false;
        }
        return true;
    }

    boolean merge(Range r) {
        if (!this.overlaps(r)) {
            return false;
        }
        this.start = Math.min(this.start, r.start);
        this.end = Math.max(this.end, r.end);

        return true;
    }


    static public int[][] mergeRanges(int[][] ranges) {
        int[][] rangesCpy = ranges.clone();
        Arrays.sort(rangesCpy, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> merged = new LinkedList<>();
        for (int[] interval : rangesCpy) {
            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
                merged.add(interval);
            } else {
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }

    int getNextNumber() throws Exception {
        if (nextNumber + step > end) {
            throw new Exception("Next number not in the given range");
        }
        return nextNumber += step;
    }

    @Override
    public String toString() {
        return "[" + this.start + ", " + this.end + "]";
    }


}

class RangeTest {
    public static void main(String[] args) throws Exception {
        int[][] arr = {{1, 5}, {4, 7}, {6, 8}, {10, 15}};
        int[][] newArr = Range.mergeRanges(arr);
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(newArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class SymmetricalMatrix {
    int size;
    int uniqueValues;
    private int[] matrixValues;


    public SymmetricalMatrix(int size) {
        this.size = 5;
        this.uniqueValues = size * (size + 1) / 2;
        this.matrixValues = new int[uniqueValues];
    }

    int calculateIndex(int i, int j) {
        int newI = Math.max(i, j) + 1;
        int newJ = Math.min(i, j);
        int offset = newI + (newJ * (newJ - 1)) / 2;
        return offset;
    }

    int get(int i, int j) {
        int index = calculateIndex(i, j);
        return matrixValues[index];
    }

    void set(int i, int j, int value) {
        int index = calculateIndex(i, j);
        if (index < uniqueValues - 1) {
            matrixValues[index] = value;
        }
    }

    public SymmetricalMatrix(int size, int defaultValue) {
        this(size);
        fill(defaultValue);
    }

    public SymmetricalMatrix(int size, Filler filler) {
        this(size);
        for (int i = 0; i < size-1; i++) {
            for (int j = 0; j < size-1; j++) {
                int fillValue = filler.fill(i, j);
                set(i, j, fillValue);
            }
        }
    }


    public void fill(int value) {
        int index = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                set(i, j, value);
            }
        }
    }

    public void clear() {
        fill(0);
    }

    public int[] getRowArray(int row) {
        int[] rowArr = new int[size];
        for (int i = 0; i < size; i++) {
            rowArr[i] = get(row, i);
        }

        return rowArr;
    }

    public int[] getColumnsArray(int column) {
        int[] columnArr = new int[size];
        for (int i = 0; i < size; i++) {
            columnArr[i] = get(column, i);
        }

        return columnArr;
    }

    SymmetricalMatrix subSymmetricMatrix(Range size) {
        SymmetricalMatrix matrix = new SymmetricalMatrix(size.end - size.start + 1);
        int cIndex = 0;

        for (int i = size.start; i <= size.end; i++) {
            int rIndex = 0;
            for (int j = size.start; j <= size.end; j++) {
                matrix.set(rIndex, cIndex, get(i, j));
                rIndex++;
            }
            cIndex++;
        }

        return matrix;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size-1; i++) {
            for (int j = 0; j < size; j++) {
                stringBuilder.append(get(i, j) + " ");
            }

            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
//        SymmetricalMatrix sm = new SymmetricalMatrix(4, ((x, y) -> {
//            Random random = new Random();
//            return random.nextInt(100);
//        }));
//        System.out.println(sm);
//
//
//        System.out.println("\n");
//        Range rn = new Range(1, 2);
//        SymmetricalMatrix subSM = sm.subSymmetricMatrix(rn);
//        System.out.println(subSM);
        SymmetricalMatrix sm = new SymmetricalMatrix(4, 1);
        sm.set(1, 1, 1123);

        System.out.println(sm);

//        0  1  3
//        1  2  4
//        3  4  5

    }
}

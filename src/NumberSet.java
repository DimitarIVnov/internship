import java.util.Arrays;

public class NumberSet {
    static final int INT_BITS = 32;
    private int[] uniqueNumbers = new int[1];
    private int size = 0;
    private int capacity = 0;

    public NumberSet(int capacity) {
        uniqueNumbers = new int[capacity / INT_BITS + 1];
    }


    void add(int n) {

        if (n > uniqueNumbers.length * INT_BITS) {
            throw new IndexOutOfBoundsException("Number " + n + " exceeds capacity");
        }

        int bitIndex = n / INT_BITS;

        if (!has(n)) {
            uniqueNumbers[bitIndex] = BitOperations.setBit(uniqueNumbers[bitIndex], n);
            size++;
        }
    }

    void delete(int n) {
        int bitIndex = n / INT_BITS;

        if (has(n)) {
            uniqueNumbers[bitIndex] = BitOperations.toggleBit(uniqueNumbers[bitIndex], n);
            size--;
        }
    }

    boolean has(int n) {
        int bitIndex = n / INT_BITS;
        return (BitOperations.getBit(uniqueNumbers[bitIndex], n));
    }

    int size() {
        return size;
    }

    void clear() {
        Arrays.fill(uniqueNumbers, 0);
        size = 0;
    }

    int[] values() {
        int[] values = new int[size];
        int valueIndex = 0;

        for (int i = 0; i < uniqueNumbers.length * INT_BITS; i++) {
            if (BitOperations.getBit(uniqueNumbers[i / INT_BITS], i)) {
                values[valueIndex] = i;
                valueIndex++;
            }
        }

        return values;
    }

    boolean equals(NumberSet ns) {
        if (this.uniqueNumbers.length != ns.uniqueNumbers.length) {
            return false;
        }

        for (int i = 0; i < uniqueNumbers.length * INT_BITS; i++) {
            if (BitOperations.getBit(this.uniqueNumbers[i / 64], i) !=
                    BitOperations.getBit(ns.uniqueNumbers[i / 64], i)) {
                return false;
            }
        }

        return true;
    }

    public String toString() {
        int[] values = values();
        StringBuilder stringBuilder = new StringBuilder(size);

        stringBuilder.append("{");
        for (int i = 0; i < values.length - 1; i++) {
            stringBuilder.append(values[i] + ", ");
        }

        stringBuilder.append(values[values.length - 1] + "}");
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        NumberSet numberSet = new NumberSet(250);
        numberSet.add(10000);
        numberSet.add(1);
        numberSet.delete(1);
        NumberSet ns = new NumberSet(10);
        ns.add(5);
        ns.add(1);

        System.out.println(ns.equals(numberSet));
        System.out.println(numberSet);

    }
}

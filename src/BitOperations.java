public class BitOperations {
    static int setBit(int num, int index) {
        return num = num | 1 << index;
    }

    static int clearBit(int num, int index) {
        return num = num & ~(1 << index);
    }

    static int toggleBit(int num, int index) {
        return num = num ^ 1 << index;
    }

    static boolean getBit(int num, int index) {
        return (num & (1 << index)) != 0;
    }

    public static void main(String[] args) {
        System.out.println(setBit(1, 1));
        System.out.println(setBit(0, 2));


        System.out.println(clearBit(3, 0));
        System.out.println(clearBit(7, 1));

        System.out.println(toggleBit(0, 1));
        System.out.println(toggleBit(5, 0));

        System.out.println(getBit(5, 0));
        System.out.println(getBit(4, 0));
    }
}


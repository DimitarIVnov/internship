public class StringBuilder2 {
    private char[] chars;
    private int length = 0;

    public StringBuilder2() {
        this.chars = new char[100];
    }

    public StringBuilder2(StringBuilder2 sb) {
        this.chars = sb.chars.clone();
    }

    public StringBuilder2(int capacity) {
        this.chars = new char[capacity];
    }

    public StringBuilder2(String str) {
        this.chars = str.toCharArray();
        length = str.length();
    }

    void append(int num) {
        append(String.valueOf(num));
    }

    void append(String str) {
        if (length + str.length() > capacity()) {
            ensureCapacity(length + str.length());
        }
        for (int i = 0; i < str.length(); i++) {
            chars[length++] = str.charAt(i);
        }

    }

    int capacity() {
        return chars.length;
    }

    int length() {
        return length;
    }

    void ensureCapacity(int minimumCapacity) {
        if (minimumCapacity > capacity()) {
            char[] tempCharArr = new char[minimumCapacity * 2];
            for (int i = 0; i < capacity(); i++) {
                tempCharArr[i] = chars[i];
            }
            this.chars = tempCharArr.clone();
        }
    }


    int indexOf(String str) {
        return indexOf(str, 0);
    }

    int indexOf(String str, int fromIndex) {
        if (length < str.length()) {
            return -1;
        }
        char[] chArr = str.toCharArray();
        for (int i = fromIndex; i < length; i++) {
            for (int j = 0; j < str.length(); j++) {
                if (chars[i + j] == chArr[j] && j == str.length() - 1) {
                    return i;
                }
            }
        }

        return -1;
    }

    int lastIndexOf(String str) {
        return indexOf(str, 0);
    }

    int lastIndexOf(String str, int fromIndex) {
        if (length < str.length()) {
            return -1;
        }
        char[] chArr = str.toCharArray();
        for (int i = fromIndex - 1; i < 0; i--) {
            for (int j = 2; j < str.length(); j++) {
                if (chars[i - j] == chArr[j] && j == str.length() - 1) {
                    return i;
                }
            }
        }

        return -1;
    }

    void setCharAt(int index, char ch) {
        chars[index] = ch;
    }

    void insert(int offset, String str) {
        if (length + str.length() > capacity()) {
            ensureCapacity(length + str.length());
        }

        int charAtIndex = 0;
        for (int i = offset; i < str.length() + length; i++) {
            chars[i + str.length() - 1] = chars[i];
            if (i > offset && i < str.length()) {
                chars[i] = str.charAt(charAtIndex);
                charAtIndex++;
            }
        }
        length = +str.length();
    }

    void insert(int index, String str, int offset, int len) {
        char[] chArr = str.toCharArray();
        char[] trimmedChArr = new char[len - offset];
        for (int i = 0; i < trimmedChArr.length; i++) {
            trimmedChArr[i] = chArr[offset + i];
        }
        insert(index, new String(trimmedChArr));
    }


    void replace(int start, int end, String str) {
        int strIndex = 0;
        for (int i = start; i < end; i++) {
            chars[i] = str.charAt(strIndex);
            strIndex++;
        }
    }

    void trimToSize() {
        int trimmedSize = capacity();
        while (chars[trimmedSize] == 0) {
            trimmedSize--;
        }
        char[] trimmedArr = new char[trimmedSize];
        for (int i = 0; i < trimmedSize; i++) {
            trimmedArr[i] = chars[i];
        }
        chars = trimmedArr.clone();
    }

    void reverse() {
        for (int i = 0; i < length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[length - 1 - i];
            chars[length - 1 - i] = temp;
        }
    }

    String substring(int start, int end) {
        char[] subStrArr = new char[end - start];

        int subStrIndex = 0;
        for (int i = start; i < end; i++) {
            subStrArr[subStrIndex] = chars[i];
            subStrIndex++;
        }
        return new String(subStrArr);
    }

    String substring(int start) {
        return substring(start, length);
    }


    void delete(int start, int end) {
        char[] deletedCharsArr = new char[length - (end - start)];
        for (int i = 0; i < length; i++) {
            if (i >= start && i <= end) {
                deletedCharsArr[i] = chars[i + (end - start)];
            } else {
                deletedCharsArr[i] = chars[i];
            }
        }

        for (int i = 0; i < length; i++) {
            if (i < deletedCharsArr.length) {
                chars[i] = deletedCharsArr[i];
            } else {
                chars[i] = 0;
            }
        }

        length -= start - end;
    }

    void delete(int start) {
        delete(start, length);
    }

    @Override
    public String toString() {
        char[] strArr = new char[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = chars[i];
        }
        return new String(strArr);
    }

    public static void main(String[] args) {
        StringBuilder2 stringBuilder2 = new StringBuilder2("abc");
        stringBuilder2.insert(1, "a");
//        stringBuilder2.insert(1, "hui");
        //stringBuilder2.delete(0, 2);
        System.out.println(stringBuilder2);

    }
}

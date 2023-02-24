import java.util.Iterator;

public class SplitLine {

    public static Iterable<String> splitLine(String str) {
        String[] linesArr = str.split("\n");

        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                return new Iterator<String>() {
                    private int currentIndex = 0;

                    public boolean hasNext() {
                        return currentIndex+1 < str.length();
                    }

                    public String next() {
                        if (!hasNext()) {
                            return null;
                        }

                        StringBuilder stringBuilder = new StringBuilder();
                        while (currentIndex < str.length() && str.charAt(currentIndex) != '\n') {
                            stringBuilder.append(str.charAt(currentIndex));
                            currentIndex++;
                        }

                        return stringBuilder.toString();
                    }

                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

    public static void main(String[] args) {
        String s = """
                ala   asdasdasdasadsd
                bala
                portokala""";

        for (String line : splitLine(s)) {
            System.out.println(line);
        }
    }
}
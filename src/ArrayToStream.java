import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class ArrayToStream {
    public <T> Stream<T> toStream(T[] arr) {
        return Arrays.stream(arr);
    }

    public static void main(String[] args) {

    }
}

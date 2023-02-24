import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

public class ToStream {
    public <T> Stream<T> toStream(Collection<T> collection) {
        return collection.stream();
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6};
        List<Integer> arrayList = Arrays.asList(arr);
        ToStream ts = new ToStream();
        Stream<Integer> stream = ts.toStream(arrayList);
        stream.forEach(System.out::println);
    }
}

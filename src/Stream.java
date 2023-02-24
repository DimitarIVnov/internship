import java.util.function.Predicate;

class Stream<T> {

    private int a;
    private float b;

    private long count;

    private boolean hasNext = false;
    private T currentElement;



    Stream<T> filter(Predicate<? super T> predicate) {
        predicate.test(currentElement);
        return this;
    }


    private Stream<T> count() {
        return this;
    }

    void display() {
        System.out.println("Display= " + a + " " + b);
    }


    public static void main(String[] args) {
        Stream <String> stream = new Stream<>();
       stream.filter(x -> x.length() > 10);


    }
}

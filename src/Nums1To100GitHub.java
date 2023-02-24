public class Nums1To100GitHub {
    public static void main(String[] args) {
        print1To100();
    }

    static void print1To100() {
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("github");
            } else if (i % 3 == 0) {
                System.out.println("git");
            } else if (i % 5 == 0) {
                System.out.println("hub");
            } else {
                System.out.println(i);
            }
        }
    }
}

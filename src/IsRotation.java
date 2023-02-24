public class IsRotation {
    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        String res = s1 + s1;

        return res.contains(s2);
    }

    public static void main(String[] args) {
        boolean rot1 = isRotation("alabala", "balaala");
        System.out.println(rot1);

        boolean rot2 = isRotation("hello", "olleh");
        System.out.println(rot2);
    }
}

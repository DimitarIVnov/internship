public class RemoveCharAt {
    public static void main(String[] args) {
        String str = "aAaa";
        str=removeCharAt(str, 1);
        System.out.println(str);
    }

    static String removeCharAt(String str, int pos) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i != pos) {
                stringBuilder.append(str.charAt(i));
            }
        }

        return stringBuilder.toString();
    }
}

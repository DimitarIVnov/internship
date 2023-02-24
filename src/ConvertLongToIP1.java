public class ConvertLongToIP1 {
    public static void main(String[] args) {
        String s = convertLongToIP(255255255255L);
        System.out.println(s);
    }

    static String convertLongToIP(long ip) {
        long[] ipArr = new long[4];

        for (int i = 0; i < 4; i++) {
            if (ip % 1000 > 255) {
                ipArr[ipArr.length - i - 1] = 255;
            } else {
                ipArr[ipArr.length - i - 1] = ip % 1000;
            }
            ip /= 1000;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            stringBuilder.append(ipArr[i] + ".");
        }
        stringBuilder.append(ipArr[3]);
        return stringBuilder.toString();
    }
}

public class ConvertToIp2 {
    public static void main(String[] args) {
        System.out.println(convertToIp(4294967295L));

    }

    static String convertToIp(long ip) {
        long[] ipArr = new long[4];
       // long ip = ipRaw % 10000000000L;

        for (int i = 0; i < 4; i++) {
            ipArr[i] = ip % 256;
            ip /= 256;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            stringBuilder.append(ipArr[i]);
            stringBuilder.append(".");
        }
        stringBuilder.delete((stringBuilder.length()-1),'.');

        return stringBuilder.toString();
    }
}

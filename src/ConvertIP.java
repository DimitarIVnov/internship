public class ConvertIP {
    public static void main(String[] args) {
        System.out.println(convertIP("255.255.255.255"));
    }

    static long convertIP(String ipStr) {
        String[] ipStrArr = ipStr.split("[.]");
        long[] ipIntArr = new long[ipStrArr.length];

        for (int i = 0; i < ipStrArr.length; i++) {
            ipIntArr[i] = Integer.parseInt(ipStrArr[i]);
        }

        long ipValue = (long) (ipIntArr[3] + ipIntArr[2] * 256 + ipIntArr[1] * Math.pow(256, 2) + ipIntArr[0] * Math.pow(256, 3));
        return ipValue;
    }
}

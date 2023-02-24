class aa {
    static private boolean arrayContains(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }

        return false;
    }

    public static int longestConsecutive(int[] nums) {
        int longestStreak = 0;

        for (int num : nums) {
            int currentNum = num;
            int currentStreak = 1;

            while (arrayContains(nums, currentNum + 1)) {
                currentNum += 1;
                currentStreak += 1;
            }

            longestStreak = Math.max(longestStreak, currentStreak);
        }

        return longestStreak;
    }

    public static void main(String[] args) {
        int[] arr = {0, 5, 1, 2, 3, 4, 5, 2, 8, 9, 10};
        int longestStreak = longestConsecutive(arr);
        System.out.println(longestStreak);
    }
}
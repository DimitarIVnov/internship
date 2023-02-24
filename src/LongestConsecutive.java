public class LongestConsecutive {
    static boolean arrayContains(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }

        return false;
    }

    static int[] longestConsecutive(int[] nums) {
        int longestStreak = 0;
        int longestStreakIndex = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int currentNum = nums[i];
            int currentStreak = 1;

            int j = 1;
            while (currentNum + 1 == nums[i + j]) {
                currentNum += 1;
                currentStreak += 1;
                j++;

                if (i + j > nums.length - 1) {
                    break;
                }
            }
            if (longestStreak < currentStreak) {
                longestStreak = currentStreak;
                longestStreakIndex = i;
            }
        }

        int[] longestStreakArr = new int[longestStreak];
        int index = 0;
        for (int i = longestStreakIndex; i < longestStreak; i++) {
            longestStreakArr[index] = nums[i];
            index++;
        }

        return longestStreakArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 8, 9, 10};
        int[] longestStreak = longestConsecutive(arr);
        for (int num : longestStreak) {
            System.out.println(num);
        }
    }
}


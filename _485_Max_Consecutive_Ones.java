public class _485_Max_Consecutive_Ones {
    public static void main(String[] args) {
        int nums[] = {1,1,0,1,1,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));

    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int count = 0;
        int tempCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                tempCount++;
            } else {
                count = Math.max(count, tempCount);
                tempCount = 0;
            }
        }
        count = Math.max(count, tempCount);
        return count;
    }
}

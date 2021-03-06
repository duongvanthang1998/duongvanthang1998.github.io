public class _26_Remove_Duplicates_from_Sorted_Array {
    public static int removeDuplicates(int[] nums) {
      
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int i = 0;
        
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }            
        }
        
        return i + 1;
    }
    public static void main(String[] args) {
        int nums[] = {1,1,2};
        System.out.println(removeDuplicates(nums));

        
    }
    
}

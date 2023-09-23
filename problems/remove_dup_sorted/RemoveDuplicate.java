package problems.remove_dup_sorted;

public class RemoveDuplicate {
    public int removeDuplicates(int[] nums) {
        int uniqueIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex += 1;
                nums[uniqueIndex] = nums[i];
            }
        }
        return uniqueIndex + 1;
    }
}

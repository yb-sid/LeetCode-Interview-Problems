package problems.move_zeroes;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;

        while (j < nums.length) {
            if (nums[j] != 0) {
                // swap with i
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i += 1;
            }
            j += 1;
        }
    }
}

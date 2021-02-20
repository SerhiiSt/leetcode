package arrays;

public class MoveZeroes {
    public static void moveZeros2(int[] nums) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] != 0)
                nums[count++] = nums[i];

        }
        while (count < len) {
            nums[count++] = 0;
        }
    }
}

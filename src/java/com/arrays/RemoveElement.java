package arrays;

public class RemoveElement {
    public static int removeElement1(int[] nums, int val) {
        int len = nums.length;
        int i = 0;
        int count = 0;
        int index = 0;
        while (i < len) {
            if (nums[i] == val) {
                count++;
            } else {
                nums[index] = nums[i];
                index++;

            }
            i++;
        }

        return nums.length - count;
    }

    private int removeElement2(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index++] = nums[i];

            }
        }
        return index;

    }
}

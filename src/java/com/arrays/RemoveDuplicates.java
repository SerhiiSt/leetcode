package arrays;

//26. Remove Duplicates from Sorted Array
public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int len = nums.length;
        int i = 0;
        if (len == 0) return 0;
        for (int j = 1; j < len; j++) {
            if (nums[j] == nums[i])
                continue;
            nums[++i] = nums[j];
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        System.out.println(removeDuplicates(nums));

    }
}

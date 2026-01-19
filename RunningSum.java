import java.util.Arrays;

public class RunningSum {
    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {1, 1, 1, 1, 1};
        int[] nums3 = {3, 1, 2, 10, 1};

        System.out.println(Arrays.toString(runningSum(nums1)));
        System.out.println(Arrays.toString(runningSum(nums2)));
        System.out.println(Arrays.toString(runningSum(nums3)));
    }
}
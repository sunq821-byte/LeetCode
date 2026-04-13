package array02;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        int[] nums = {8, 7, 3, 5, 3, 6, 1, 4};
        int[] r = findErrorNums(nums);
        System.out.println(Arrays.toString(r));  // 输出: [3, 2]
    }

    public static int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int duplicate = -1;
        int missing = -1;

        // 第一遍：使用标记法找出重复数字
        for (int i = 0; i < n; i++) {
            int index = Math.abs(nums[i]) - 1;  // 使用绝对值，因为可能已经被标记为负数

            // 如果该位置已经是负数，说明这个数字之前出现过
            if (nums[index] < 0) {
                duplicate = Math.abs(nums[i]);
            } else {
                // 标记该位置为负数，表示这个数字出现过
                nums[index] = -nums[index];
            }
        }

        // 第二遍：找出缺失的数字
        for (int i = 0; i < n; i++) {
            // 如果某个位置是正数，说明对应的数字没有出现过
            if (nums[i] > 0) {
                missing = i + 1;
                break;
            }
        }

        return new int[]{duplicate, missing};
    }
}
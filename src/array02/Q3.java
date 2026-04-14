package array02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q3 {
    public static void main(String[] args){
        // 找出[1,nums.length] 范围内没出现的值
        //测试1
        int[] arr1 = {4,3,2,7,8,2,3,1};
        List<Integer> test1 = findDisappearedNumbers(arr1);
        System.out.println(test1);  // 应该输出 [5, 6]
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        // 创建一个ArrayList
        List<Integer> result = new ArrayList<>();
        int n = nums.length;

        // 方法1：原地标记法
        for (int i = 0; i < n; i++) {
            int index = Math.abs(nums[i]) - 1;  // 数字1对应下标0
            if (nums[index] > 0) {
                nums[index] = -nums[index];  // 标记为负数
            }
        }

        // 收集未出现的数字
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);  // 注意：i+1才是缺失的数字
            }
        }

        return result;

    }
}

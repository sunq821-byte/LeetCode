package array02;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args){
        // 在数组中找到比元素i小的个数（在该数组中找） 从1开始比较
        //测试1
        int[] arr1 = {8,1,2,2,3};
        int[] test1 = smallerNumbersThanCurrent(arr1);
        System.out.println(Arrays.toString(test1));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];


        // 循环取出每个元素
        for(int i = 0; i<n;i++){
            // 统计比i小的数量
            int count = 0;
            // 循环统计比该元素小的个数
            for(int j= 0;j<n;j++){
                if(nums[i]>nums[j]){
                    count++;
                    result[i]=count;
                }
            }
        }

        return result;
    }
}

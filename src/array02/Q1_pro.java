package array02;

import java.util.ArrayList;
import java.util.Arrays;

public class Q1_pro {
    public static void main(String[] args){
        // 找重复或缺少的数，连续的，可能从小到大也可能从大到小，围绕数组来写

        // 测试1
        int[] num1 = {1,2,3,3,5};
        int[] test1 = findErrorNums(num1);
        System.out.println(Arrays.toString(test1));
        // 测试2
        int[] num2 = {8,7,3,5,4,3,2,1};
        int[] test2 = findErrorNums(num2);
        System.out.println(Arrays.toString(test2));
        //测试3
        int[] num3 = {8,7,5,4,3,2,1};
        int[] test3 = findErrorNums(num2);
        System.out.println(Arrays.toString(test3));

    }
    // 定义方法
    public static int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] result = new int[2];

        // 找重复
        for(int i = 0; i<n;i++){
            int index = Math.abs(nums[i]) -1;
            if(nums[index]<0){
                result[0]=Math.abs(nums[i]);
            }else{
                nums[index]=-nums[index];
            }
        }
        for(int i = 0;i<n;i++){
            if(nums[i]>0){
                result[1]=i+1;
                break;
            }
        }

        return result;
    }

}

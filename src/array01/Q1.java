package array01;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args){
           int[] nums = {1,2,3,4,5,6};
           int[] ans = getConcatenation(nums);
           System.out.println(Arrays.toString(ans));
    }

    public static int[] getConcatenation(int[] nums){
        int n = nums.length;
        int[] ans = new int[n*2];
        for(int i = 0;i< n;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        return ans;
    }

}

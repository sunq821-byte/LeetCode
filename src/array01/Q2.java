package array01;
// ÖØÅÅÊı×é

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args){
        int[] nums = {2,5,1,3,4,7};
        int[] ans =shuffle(nums,3);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2*n];
        for(int i = 0; i< n;i++){
            result[2*i]=nums[i];
            result[2*i+1]=nums[i+n];
        }
        return  result;
    }
}

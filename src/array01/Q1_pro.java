package array01;
// Êý×é´®Áª
import java.util.Arrays;

public class Q1_pro {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6};
        int[] ans = getConcatenation(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] getConcatenation(int[] nums){
        int[] result = new int[nums.length*2];
        System.arraycopy(nums,0,result,0,nums.length);
        System.arraycopy(nums,0,result,nums.length,nums.length);
        return result;
    }
}

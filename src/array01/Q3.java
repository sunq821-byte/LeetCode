package array01;
// 最大连续1的个数

public class Q3 {
    public static void main(String[] args){
        int[] nums = {1,1,0,1,0,1};
        int r = findMaxConsecutiveOnes(nums);
        System.out.println(r);
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        // 定义两个计数器
        // temp存每次循环出来的
        int temp = 0;
        // result存最大的
        int result = 0;
        // 循环计数
        for(int i = 0; i < nums.length;i++){
            if(nums[i]==1){
                temp++;

                if(temp>result){
                    result=temp;
                }
            }else{
                temp=0;
            }
        }

        return result;
    }
}

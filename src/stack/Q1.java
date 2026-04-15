package stack;

import java.util.ArrayList;
import java.util.List;

public class Q1 {
    public static void main(String[] args){
        int[] nums = {1,3};
        List<String> result = buildArray(nums,3);
        System.out.println(result);
    }

    public static List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();
        // target 的指针
        int i = 0;
        // 当前从流中读取的数字，从1到n
        int cur = 1;

        while (i < target.length && cur <= n) {
            // 对当前数字 cur 先 Push
            result.add("Push");

            if (cur == target[i]) {
                // 匹配成功，保留，i 移到下一个目标
                i++;
            } else {
                // 不匹配，Pop 掉
                result.add("Pop");
            }

            cur++; // 读取下一个数字
        }

        return result;
    }

}

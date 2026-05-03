package mtj;
// 输入正整数N和M，其中N<=M。求区间[N，M]中可被K整除的总数。

import java.util.Scanner;

public class MT1142 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //  初始化用户录入的三个数
        int n,m,k;
        // 判断N<=M
        while(true){
            n = input.nextInt();
            m = input.nextInt();
            k = input.nextInt();
            if(n<=m){
                break;
            }else{
                System.out.println("请重新录入，确保N<=M");
            }
        }

        // 通过循环计算区间内可被K整除的数
        int count = 0;
        for (int i = n; i <= m; i++) {
            if(i%k==0){
                count++;
            }
        }
        System.out.println(count);
    }
}

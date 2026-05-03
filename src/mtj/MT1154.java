package mtj;

import java.util.Scanner;

// 若一个自然数的所有真因数之和比这个数小，
// 此数就叫做缺数。输入正整数N，找出该数字是否为缺数输出YES或者NO
public class MT1154 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= N/2; i++) {
            if(N%i==0){
                sum+=i;
            }
        }
        if(sum> N){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
        input.close();
    }
}

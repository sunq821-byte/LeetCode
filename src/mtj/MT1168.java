package mtj;
// 输入正整数N，找出它是否是一个等于其他数的阶乘值的数，输出YES或者NO。

import java.util.Scanner;

public class MT1168 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // code here
        int N = input.nextInt();

        long fact = 1;
        int i = 1;
        while(fact<=N){
            if(fact == N){
                System.out.println("YES");
                return;
            }
            i++;
            fact*=i;
        }
        System.out.println("NO");
        input.close();
    }
}

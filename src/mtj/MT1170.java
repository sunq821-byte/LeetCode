package mtj;

import java.util.Scanner;

// 输入正整数N，判断它是不是一个四叶玫瑰数，
// 输出YES或者NO。四位玫瑰数是4位数的自幂数，
// 它的每个位上的数字的4次幂之和等于它本身。
public class MT1170 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int original = N;
        int sum = 0;

        // 判断这个数是否为四位
        if(N>=1000 && N<=9999){
            for (int i = 0; i < 4; i++) {
                int temp=N%10;
                sum += Math.pow(temp, 4);
                N = N/10;
            }
            if(original==sum){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }else{
            System.out.println("NO");
        }
    }
}

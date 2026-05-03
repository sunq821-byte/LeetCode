package mtj;
// 输入正整数N，计算其所有真因子之和。自然数的真因子是严格小于该数的除数。
import java.util.Scanner;
public class MT1153 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= N/2; i++) {
            if(N%i==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}

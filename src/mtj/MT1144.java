package mtj;
// 输入正整数N，检查它是否可以被其数字之和整除，输出YES或者NO。不考虑不合理的输入等特殊情况。
import java.util.Scanner;
public class MT1144 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int temp = N;
        int sum = 0;
        while(temp!=0){
            sum += temp%10;
            temp /= 10;
        }

        if(N%sum==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}

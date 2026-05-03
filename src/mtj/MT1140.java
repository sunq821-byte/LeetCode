package mtj;

import java.util.Scanner;

// 输入一个整数N，
// 判断它是不是整数7的和、差之类的。
// (比如某数等于7+7, 或者7-7,或者7-7-7+7+7…)是则输出YES否则或者NO
public class MT1140 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        if(N%7==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}

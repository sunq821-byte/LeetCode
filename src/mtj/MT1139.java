package mtj;
//输入正整数N，判断它是否可被11或13整除，输出YES或者NO。

import java.util.Scanner;
public class MT1139 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 用户录入正整数N
        int N = input.nextInt();

        // 判断N是否可被11或13整除
        if(N%11==0 || N%13==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}

package mtj;
// 输入正整数N，将N的所有零转换为5。没有0就原样输出。不考虑不合理的输入等特殊情况。

import java.util.Scanner;

public class MT1161 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

//        转字符串，0替换成5
//        String s = String.valueOf(num);
//        String newStr = s.replace('0', '5');
//
//        转回整型输出
//        int res = Integer.parseInt(newStr);
//        System.out.println(res);

        String s = String.valueOf(num);
        String newStr = s.replace('0','5');

        int res = Integer.parseInt(newStr);
        System.out.println(res);


    }
}

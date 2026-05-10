package mtj;

import java.util.Scanner;

// 输入正整数N，检查该数是否为自守数输出YES或者NO。
// 当且仅当一个数的平方以与该数相同的数字结尾时，该数称为自守数。
public class MT1167 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        long square = (long) N * N;
        String s = String.valueOf(N);
        String sq = String.valueOf(square);

        if (sq.endsWith(s)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

package mtj;
// 在质数中，若两个质数之差为2,我们称之为孪生质数,
// 例如（3、5）（5、7），输入2个正整数，
// 判断他是不是孪生质数，输出YES或者NO。

import java.util.Scanner;

public class MT1163 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        // 判断是否为孪生质数
        if (isPrime(num1) && isPrime(num2) && Math.abs(num1 - num2) == 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        input.close();
    }

    // 判断质数
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;     // 0 和 1 不是质数
        }
        if (n == 2) {
            return true;      // 2 是质数
        }
        if (n % 2 == 0) {
            return false; // 偶数不是质数
        }

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

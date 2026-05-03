package mtj;
// 编写一个模拟简单计算器的程序，计算表达式：a op b的值，
// 要求 a、op、b从盘输入。其中a、b（作除数时不能为0）为数值，
// op为运算符+、－、*、/。本题不考虑非法输入等特殊情况。

import java.util.Scanner;

public class MT1134 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 读取用户输入的完整表达式字符串
        String exp = input.nextLine();

        // 初始化运算符的位置索引为-1（表示未找到）
        int opIndex = -1;
        // 初始化运算符字符变量
        char opChar = 0;

        // 从索引1开始遍历表达式字符串，查找运算符位置
        for (int i = 1; i < exp.length(); i++) {
            char c = exp.charAt(i);
            // 判断当前字符是否为运算符
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                // 记录运算符的位置
                opIndex = i;
                // 记录找到的运算符字符
                opChar = c;
                // 找到后立即退出循环
                break;
            }
        }

        // 对录入的字符串进行转换操作 截取第一个操作数a
        double a = Double.parseDouble(exp.substring(0, opIndex));
        // 截取第二个操作数b
        double b = Double.parseDouble(exp.substring(opIndex + 1));

        // 初始化结果变量
        double result = 0;

        // 将截取到的运算符进行转换为String类型
        String op = String.valueOf(opChar);

        // 根据运算符进行相应的运算
        switch (op) {
            case "+":
                // 加法运算
                result = a + b;
                break;

            case "-":
                // 减法运算
                result = a - b;
                break;

            case "*":
                // 乘法运算
                result = a * b;
                break;

            case "/":
                // 除法运算前需要检查除数是否为0
                if (b != 0) {
                    // 除数不为0时执行除法
                    result = a / b;
                } else {
                    // 除数为0时输出错误信息并终止程序
                    System.out.println("错误：除数不能为0");
                    return;
                }
                break;
        }
        System.out.printf("%.6f",result);
        input.close();
    }
}

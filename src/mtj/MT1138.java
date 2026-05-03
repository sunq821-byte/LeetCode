package mtj;

import java.util.Scanner;

// 输入日期（YYYY-M-D），然后输出它是一年中的第几天。不考虑负数或者其他特殊情况。
public class MT1138 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 用户格式录入日期字符串
        String dateStr = input.nextLine();

        // 将字符串按"-"分割成数组
        String[] parts = dateStr.split("-");
        // 获取年、月、日
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        // 定义一个数组，用于存储每个月的天数
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // 判断闰年或平年
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            daysInMonth[1] = 29;
        }

        // 计算该日期是该年的第几天
        int dayOfYear = 0;
        for (int i = 0; i < month - 1; i++) {
            dayOfYear += daysInMonth[i];
        }
        dayOfYear += day;

        System.out.println(dayOfYear);
    }
}

package mtj;
// 存在一个数x(大于10)，除以7余2，除以11余4，除以13余5，求这个数最小值。
public class MT1149 {
    public static void main(String[] args) {
        int x = 0;
        for (int i = 10; i <= 1000; i++) {
            if (i % 7 == 2 && i % 11 == 4 && i % 13 == 5) {
                x = i;
                System.out.println(x);
                break;
            }
        }

    }
}

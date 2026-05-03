package mtj;
// 存在一个数x(大于10)，除以3余2，除以5余3，除以7余1，求这个数最小值。
public class MT1148 {
    public static void main(String[] args) {
        int x = 0;
        for (int i = 10; i <= 1000; i++) {
            if (i % 3 == 2 && i % 5 == 3 && i % 7 == 1) {
                x = i;
                System.out.println(x);
                break;
            }
        }

    }
}

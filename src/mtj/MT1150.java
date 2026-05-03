package mtj;
// 带1500名兵士打仗，
// 战死四五百人，站3人一排，多出2人；
// 站5人一排，多出4人；站7人一排，多出6人。问战死多少人。
public class MT1150 {
    public static void main(String[] args) {
        int x = 0;
        for (int i = 1000; i <= 1500; i++) {
            if (i % 3 == 2 && i % 5 == 4 && i % 7 == 6) {
                x = i;
                System.out.println(1500-x);
                break;
            }
        }
    }
}

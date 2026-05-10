package mtj;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class MT2114_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int l = s.length();
        Stack<Integer> st = new Stack<>();
        int[] a = new int[l];

        for (int i = 0; i < l; i++) {
            if (s.charAt(i) == '(') {
                st.push(i);
            } else {
                if (!st.empty()) {
                    a[st.peek()] = 1;
                    a[i] = 1;
                    st.pop();
                }
            }
        }

        int mx = 0, cnt = 0;
        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < l; i++) {
            if (a[i] == 1) {
                cnt++;
            } else {
                if (cnt >= mx) {
                    mx = cnt;
                    mp.put(mx, mp.getOrDefault(mx, 0) + 1);
                }
                cnt = 0;
            }
        }

        if (cnt >= mx) {
            mx = cnt;
            mp.put(mx, mp.getOrDefault(mx, 0) + 1);
        }

        if (mx == 0) {
            mp.put(mx, 1);
        }

        System.out.println(mx + " " + mp.get(mx));

        input.close();
    }
}
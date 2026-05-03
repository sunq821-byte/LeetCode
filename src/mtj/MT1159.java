package mtj;
// 某数组含有N个元素，输出那些数字来自集合{4,5,6}的元素，按原序。没有就输出-1。
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MT1159 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = input.nextInt();
        }

        int count = 0;
        List<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if(arr[i]==4 || arr[i] == 5 || arr[i] == 6){
                newArr.add(arr[i]);
            }
        }
        if (newArr.isEmpty()) {
            System.out.println(-1);
        } else {
            for (int num : newArr) {
                System.out.print(num + " ");
            }
        }
    }
}

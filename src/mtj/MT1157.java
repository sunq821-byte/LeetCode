package mtj;
// 输入4X4的整型矩阵A和B，判断是否为相等，输出YES或者NO。
import java.util.Scanner;
public class MT1157 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] A = new int[4][4];
        int[][] B = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                A[i][j]=input.nextInt();
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                B[i][j]=input.nextInt();
            }
        }

        boolean flag = true;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(A[i][j] != B[i][j]){
                    flag = false;
                }
            }
        }
        if(flag) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}

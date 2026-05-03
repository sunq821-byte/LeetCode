package mtj;
// 输入3X3的整型矩阵A，判断是否为单位矩阵，输出YES或者NO。
import java.util.Scanner;
public class MT1155 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j]=input.nextInt();
            }
        }

        boolean flag = true;
        for(int i = 0; i< 3; i++){
            for (int j = 0; j < 3; j++) {
                if(i==j){
                    if(A[i][j]!=1){
                        flag = false;
                        break;
                    }
                }else{
                    if(A[i][j]!=0){
                        flag = false;
                        break;
                    }
                }
            }
            if(!flag){
                break;
            }
        }
        if ( flag){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}

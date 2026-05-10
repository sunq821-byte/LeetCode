package mtj;
import java.util.Scanner;
import java.util.*;
// 小码哥在研究只有左括号和右括号组成的序列。给出一个括号序列，求出最长合法子串和它的数量（合法的定义：这个序列中左右括号匹配）。
//例如:(()不合法，)()(也不合法，但()()和(())合法。
public class MT2114 {
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        // code here
        // 左左右右 左右左右
        String str = input.next();
        // 首先要将输入的转换为一个数组样式
        String[] charArr = str.split("");
        System.out.println(Arrays.toString(charArr));

        // 根据 左左右右 左右左右 进行判断
        for (int i = 0; i < charArr.length; i++) {
            if(charArr[i]=="("){
                if(charArr[i+1]==")"){

                }else if(charArr[i+1]=="("){

                }
            }
        }


        input.close();

    }

}

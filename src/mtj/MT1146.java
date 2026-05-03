package mtj;
// 存在一个数x，除以3余2，除以5余3，除以7余2，然后求这个数
import java.util.Scanner;
public class MT1146 {
    public static void main(String[] args){
        int x = 0;
        for(int i=1;i<=100;i++){
            if(i%3==2 && i%5==3 && i%7==2){
                x = i;
                break;
            }
        }
        System.out.println(x);
    }
}

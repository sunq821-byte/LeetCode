package mtj;
// 韩信点兵(大于10人)，三个三个一排多2个，
// 五个五个一排又多2个，七个七个一排还多2个。
// 韩信生气了，怎么总多你俩，出去!问原本队伍里面最少应该有多少人。
public class MT1151 {
    public static void main(String[] args){
        int sum = 0;
        for (int i = 10; i < 1000; i++) {
            if(i%3==2 && i%5==2 && i%7==2){
                sum = i;
                System.out.println(sum);
                break;
            }
        }

    }
}

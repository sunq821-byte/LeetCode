package mtj;
// 韩信点兵(大于10人)，三个三个一排少1个人，
// 五个五个一排又少1个人，七个七个一排还少1个人。
// 韩信生气了，从别的队伍里调来一个人!
// 这样不管是三个一排五个一排还是七个一排都完美了。问原本最少应该有多少人。
public class MT1152 {
    public static void main(String[] args){
        int sum = 0;
        for (int i = 10; i < 1000; i++) {
            if(i%3==0 && i%5==0 && i%7==0){
                sum = i;
                System.out.println(sum-1);
                break;
            }
        }

    }
}

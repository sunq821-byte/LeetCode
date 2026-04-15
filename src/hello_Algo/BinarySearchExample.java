package hello_Algo;

public class BinarySearchExample {
    public static void main(String[] args){
        // 创建字典：按照拼音字母表顺序排列
        char[] dictionary = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
                'w', 'x', 'y', 'z'};
        // 目标：查找拼音首字母为'r'的字
        char target = 'r';

        System.out.println("开始查找目标字母: " + target);
        System.out.println("字典内容: " + new String(dictionary));
        System.out.println("----------------------------");

        // 执行二分查找
        int result = binarySearch(dictionary, target);

        System.out.println("----------------------------");
        if (result != -1){
            System .out.println("查找成功！字母 '" + target + "' 位于索引 " + result);
        } else {
            System.out.println("查找失败！字典中没有字母 '" + target + "'");
        }
    }

    /**
     * 二分查找方法
     * @param dictionary 已排序的字典数组（这里用拼音首字母表示）
     * @param target 要查找的目标首字母
     * @return 目标字母在数组中的索引，如果未找到则返回-1
     */
    public static int binarySearch(char[] dictionary,char target){
        // 查找范围的左边界
        int left = 0;
        // 查找范围的右边界
        int right = dictionary.length - 1;

        while(left <= right){
            // 1.翻开字典约一半的页数，查看该页的首字母
            // 防止整数溢出
            int mid = left + (right - left) / 2;
            char midChar = dictionary[mid];
            System.out.println("当前查找范围：["+left+","+right+"],中间字母:"+midChar);

            // 2.比较中间字母与目标字母
            if(midChar == target){
                // 找到目标字母
                return mid;
            }else if(target> midChar){
                // 目标字母在m之后，排除前半部分，查找后半部分
                left = mid + 1;
                System.out.println("目标字母在" + midChar + "之后，缩小范围到后半部分");
            } else {
                //  目标字母在m之前，排除后半部分，查找前半部分
                right = mid - 1;
                System.out.println("目标字母在" + midChar + "之前，缩小范围到前半部分");
            }
        }
        // 3. 循环结束仍未找到
        return -1;
    }

}

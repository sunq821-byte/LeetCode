package hello_Algo;

public class InsertionSortExample {

    /**
     * 获取扑克牌的排序权重
     * 2-10: 2-10, J=11, Q=12, K=13, A=14
     */
    private static int getCardValue(char card) {
        switch (card) {
            case '2': return 2;
            case '3': return 3;
            case '4': return 4;
            case '5': return 5;
            case '6': return 6;
            case '7': return 7;
            case '8': return 8;
            case '9': return 9;
            case 'J': return 11;  // J
            case 'Q': return 12;  // Q
            case 'K': return 13;  // K
            case 'A': return 14;  // A
            default: return 0;    // 非法牌
        }
    }

    /**
     * 将权重转换回扑克牌字符
     */
    private static char getCardChar(int value) {
        switch (value) {
            case 2: return '2';
            case 3: return '3';
            case 4: return '4';
            case 5: return '5';
            case 6: return '6';
            case 7: return '7';
            case 8: return '8';
            case 9: return '9';
            case 10: return '0'; // 注意：这里用0表示10，实际中可能需要特殊处理
            case 11: return 'J';
            case 12: return 'Q';
            case 13: return 'K';
            case 14: return 'A';
            default: return '?';
        }
    }

    /**
     * 插入排序方法（模拟整理扑克牌）
     * @param cards 待排序的扑克牌数组
     * @return 排序后的数组
     */
    public static char[] insertionSort(char[] cards) {
        if (cards == null || cards.length <= 1) {
            return cards;
        }

        // 从第2个元素开始排序
        for (int i = 1; i < cards.length; i++) {
            char currentCard = cards[i];
            int currentValue = getCardValue(currentCard);
            int j = i - 1;

            // 将currentCard插入到有序区的正确位置
            // 使用getCardValue()比较扑克牌的大小
            while (j >= 0 && getCardValue(cards[j]) > currentValue) {
                cards[j + 1] = cards[j]; // 后移一位
                j--;
            }
            // 找到插入点
            cards[j + 1] = currentCard;

            // 打印当前排序状态
            System.out.print("第" + i + "轮排序后：");
            printArray(cards);
        }

        return cards;
    }

    /**
     * 改进的插入排序，可以处理10的情况
     */
    public static String[] insertionSortWithStrings(String[] cards) {
        if (cards == null || cards.length <= 1) {
            return cards;
        }

        for (int i = 1; i < cards.length; i++) {
            String currentCard = cards[i];
            int currentValue = getCardValueFromString(currentCard);
            int j = i - 1;

            while (j >= 0 && getCardValueFromString(cards[j]) > currentValue) {
                cards[j + 1] = cards[j];
                j--;
            }
            cards[j + 1] = currentCard;

            System.out.print("第" + i + "轮排序后：");
            for (String card : cards) {
                System.out.print(card + " ");
            }
            System.out.println();
        }

        return cards;
    }

    /**
     * 处理字符串表示的牌（包括"10"）
     */
    private static int getCardValueFromString(String card) {
        if (card.length() == 1) {
            return getCardValue(card.charAt(0));
        } else if (card.equals("10")) {
            return 10;
        } else {
            return 0;
        }
    }

    /**
     * 辅助方法：打印数组
     */
    private static void printArray(char[] arr) {
        for (char c : arr) {
            if (c == '0') {
                System.out.print("10 ");
            } else {
                System.out.print(c + " ");
            }
        }
        System.out.println();
    }

    /**
     * 示例1：使用字符数组（不能表示10）
     */
    public static void example1() {
        System.out.println("=== 示例1：字符数组（A作为最大值）===");
        char[] pokerCards = {'4', '2', 'A', 'K', '3', 'Q', 'J', '5'};
        System.out.print("初始扑克牌（无序）：");
        for (char c : pokerCards) {
            System.out.print(c + " ");
        }
        System.out.println("\n");

        char[] sortedCards = insertionSort(pokerCards.clone());

        System.out.print("\n最终排序结果：");
        for (char c : sortedCards) {
            System.out.print(c + " ");
        }
        System.out.println("\n(排序规则：2<3<4<5<6<7<8<9<J<Q<K<A)");
    }

    /**
     * 示例2：使用字符串数组（可以表示10）
     */
    public static void example2() {
        System.out.println("\n=== 示例2：字符串数组（可以包含10）===");
        String[] pokerCards = {"4", "2", "A", "K", "3", "Q", "J", "5", "10", "7"};
        System.out.print("初始扑克牌（无序）：");
        for (String card : pokerCards) {
            System.out.print(card + " ");
        }
        System.out.println("\n");

        String[] sortedCards = insertionSortWithStrings(pokerCards.clone());

        System.out.print("\n最终排序结果：");
        for (String card : sortedCards) {
            System.out.print(card + " ");
        }
        System.out.println("\n(排序规则：2<3<4<5<6<7<8<9<10<J<Q<K<A)");
    }

    /**
     * 示例3：与您原始示例相同的测试
     */
    public static void example3() {
        System.out.println("\n=== 示例3：您原始示例的测试 ===");
        char[] pokerCards = {'4', '2', 'A', '5', '3'};
        System.out.print("初始扑克牌（无序）：");
        for (char c : pokerCards) {
            System.out.print(c + " ");
        }
        System.out.println("\n");

        char[] sortedCards = insertionSort(pokerCards.clone());

        System.out.print("\n最终排序结果：");
        for (char c : sortedCards) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 运行所有示例
        example1();
        example2();
        example3();
    }
}
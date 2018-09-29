package algorithm;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 示例 1:
 * 输入: 121
 * 输出: true
 *
 * 示例 2:
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 *
 * 示例 3:
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 */
public class PalindromeNumber {

    public static boolean solution(int num) {

        if (num < 0 || (num % 10 == 0 && num != 0)) {
            return false;
        }
        int reverse = reverse(num);
        if (reverse == num) {
            return true;
        }
        return false;
    }

    public static int reverse(int num) {

        int result = 0;
        int p = num;
        while (p != 0) {
            int pop = p % 10;
            p /= 10;
            result = result * 10 + pop;
        }
        return result;
    }

    public static void main(String[] args) {
        int num = 3120213;
        boolean result = PalindromeNumber.solution(num);
        System.out.println(result);
    }
}

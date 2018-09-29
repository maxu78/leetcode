package algorithm;

/**
 * 给定一个 32 位有符号整数，将整数中的数字进行反转。
 *
 * 示例 1:
 * 输入: 123
 * 输出: 321
 *
 * 示例 2:
 * 输入: -123
 * 输出: -321
 *
 * 示例 3:
 * 输入: 120
 * 输出: 21
 */
public class ReverseInteger {

    public static int solution(int x) {

        int p = x;
        int result = 0;
        while (p != 0) {
            int pop = p % 10;
            p /= 10;
            //溢出处理？

            result = result * 10 + pop;

        }
        return result;
    }

    public static void main(String[] args) {
        int x = -123;
        int reverse = ReverseInteger.solution(x);
        System.out.println(reverse);
    }
}

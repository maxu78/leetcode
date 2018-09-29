package algorithm;


/**
 * 将字符串 "PAYPALISHIRING" 以Z字形排列成给定的行数：
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * 之后从左往右，逐行读取字符："PAHNAPLSIIGYIR"
 * 实现一个将字符串进行指定行数变换的函数:
 * string convert(string s, int numRows);
 *
 * 示例 1:
 * 输入: s = "PAYPALISHIRING", numRows = 3
 * 输出: "PAHNAPLSIIGYIR"
 *
 * 示例 2:
 * 输入: s = "PAYPALISHIRING", numRows = 4
 * 输出: "PINALSIGYAHRPI"
 * 解释:
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 */
public class ZigZagConversion {

    /**
     *
     * @param str
     * @param rows
     * @return
     */
    public static String solution(String str, int rows) {
        int interval = 2 * (rows - 1);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; i + j < str.length(); j += interval) {
                sb.append(str.charAt(i + j));
                if (i != 0 && i != rows - 1 && j + interval - i < str.length()) {
                    sb.append(str.charAt(j + interval - i));
                }
            }

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "PAYPALISHIRING";
        int rows = 2;
        String s = ZigZagConversion.solution(str, rows);
        System.out.println(s);
    }
}

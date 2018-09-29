package algorithm;

/**
 *给定一个字符串s，找到 s 中最长的回文子串。你可以假设s的最大长度为1000。
 *
 *示例 1：
 *输入: "babad"
 *输出: "bab"
 *注意: "aba"也是一个有效答案。
 *
 *示例 2：
 *输入: "cbbd"
 *输出: "bb"
 */
public class LongestPalindromicSubstring {

    public static String solution(String s) {

        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len >= end - start + 1) {
                start = i - (len - 1) / 2;  //等价于奇数时start = i - len / 2; 偶数时start = i - len / 2 - 1;
                end = i + len / 2;          //等价于奇数时start = i + len / 2 - 1; 偶数时start = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    /**
     * 以i,j为中心获取回文的长度
     * @param str
     * @param i
     * @param j
     * @return
     */
    public static int expandAroundCenter(String str, int i, int j) {

        int left = i, right = j;
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        String str = "abbacbab";
        String s = LongestPalindromicSubstring.solution(str);
        System.out.println(s);
    }
}

package algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *给定一个字符串，找出不含有重复字符的最长子串的长度。
 *
 *示例 1:
 *输入: "abcabcbb"
 *输出: 3
 *解释: 无重复字符的最长子串是 "abc"，其长度为 3。
 *
 *示例 2:
 *输入: "bbbbb"
 *输出: 1
 *解释: 无重复字符的最长子串是 "b"，其长度为 1。
 *
 *示例 3:
 *输入: "pwwkew"
 *输出: 3
 *解释: 无重复字符的最长子串是 "wke"，其长度为 3。
 *请注意，答案必须是一个子串，"pwke" 是一个子序列 而不是子串。
 */
public class LongestSubstringOper {


    public static int[] solution(String str) {
        int[] result = new int[2];
        int len = 0;

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0, j = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                j = Math.max(map.get(str.charAt(i)) + 1, j);
            }

            map.put(str.charAt(i), i);

            if (len < i - j + 1) {
                result[0] = j;
                result[1] = i;
                len = i - j + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "pwdepwwpkew";
        int[] arr = LongestSubstringOper.solution(str);
        System.out.println(Arrays.toString(arr));
    }
}

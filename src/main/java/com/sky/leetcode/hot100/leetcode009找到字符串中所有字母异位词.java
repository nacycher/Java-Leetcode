package com.sky.leetcode.hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 438-找到字符串中所有字母异位词
 */
public class leetcode009找到字符串中所有字母异位词 {

    /**
     * p排序
     * s，根据p的长度截取出同样长度，排序，后比较
     */
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        char[] pCharArray = p.toCharArray();
        Arrays.sort(pCharArray);
        for (int i = 0; i <= s.length()- pCharArray.length; i++) {
            int j = i + pCharArray.length;
            char[] sCharArray = s.substring(i, j).toCharArray();
            Arrays.sort(sCharArray);
            if (compareChars(pCharArray, sCharArray)) {
                result.add(i);
            }
        }
        return result;
    }
    
    private static boolean compareChars(char[] pCharArray, char[] sCharArray) {
        for (int i = 0; i < pCharArray.length; i++) {
            if (pCharArray[i] != sCharArray[i]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String s = "abab";
        String p = "ab";
        List<Integer> anagrams = findAnagrams(s, p);
        for (int i = 0; i < anagrams.size(); i++) {
            System.out.println(anagrams.get(i));
        }
    }
}

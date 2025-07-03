package com.sky.leetcode.hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * 49. 字母异位词分组
 */
public class leetcode02字母异位词分组 {

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (String s : strs) {
            char[] sCharArray = s.toCharArray();
            Arrays.sort(sCharArray);
            String key = new String(sCharArray);
            List<String> list = hashMap.getOrDefault(key, new ArrayList<>());
            list.add(s);
            hashMap.put(key, list);
        }
        return hashMap.values().stream().toList();
    }

    public static void main(String[] args) {
        String[] s = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> lists = groupAnagrams(s);
        for (List<String> list : lists) {
            System.out.println(list);
        }
    }
}

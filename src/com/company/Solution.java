package com.company;

public class Solution {
    public static void main(String[] args) {
        String[] s = {"preheat", "oven", "prehistoric"};
        System.out.println(longestCommonPrefix(s));
    }
    public static String longestCommonPrefix(String[] strs) {
        String output = "";
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].isEmpty()) {
                return "";
            } else {
                continue;
            }
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String attach = strs[0];
        for (int i = 0; i < attach.length(); i++) {
            char element = attach.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                int len = strs[j].length();
                if (i + 1 <= len) {
                    if (element == strs[j].charAt(i)) {
                        if (j == strs.length - 1) {
                            output = output + element;
                        } else {
                            continue;
                        }
                    } else {
                        if (i == 0) {
                            return "";
                        } else {
                            return output;
                        }
                    }
                } else {
                    return output;
                }
            }
        }
        return output;
    }
}

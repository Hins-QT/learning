package com.hins.qt.basics.collection.list;

import java.util.ArrayList;

/**
 * @author PanHao
 * @date 2022/6/8 16:11
 */
public class ForArrayList {
    public static void main(String[] args) {

        int[] parse = parse("10111");
        System.out.println(parse[1]);
    }
    public static int[] parse(String str) {
        int length = str.length();
        int[] result = new int[length];
        // 依次取得字符串中的每一个字符，并将其转化为数字，放进int数组中
        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            result[i] = Character.getNumericValue(c);
        }
        return result;
    }
}

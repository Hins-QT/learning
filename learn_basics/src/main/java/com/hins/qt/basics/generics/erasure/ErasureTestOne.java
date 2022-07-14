package com.hins.qt.basics.generics.erasure;

import java.util.ArrayList;

/**
 * @author PanHao
 * @date 2022/7/12 9:51
 */
public class ErasureTestOne {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Object> objects = new ArrayList<>();
        Person test = new Person("test");
        //此处为验证代码
//        objects = strings;
        /**
         * 泛型不变性
         * 即使两个集合中的泛型存在继承关系
         *
         */
    }
}

package com.hins.qt.basics.generics.erasure;

import java.util.ArrayList;

/**
 * @author PanHao
 * @date 2022/7/12 9:51
 * 泛型擦除测试
 */
public class ErasureTestOne {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Object> objects = new ArrayList<>();
        //此处为验证代码 泛型擦除
        Boolean result = objects.getClass() == strings.getClass();
        System.out.println(result);
/**
 *      通过反射向集合中插入不同类型数据
 */
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        Person test = new Person("test");
        integers.getClass().getMethod("add", Object.class).invoke(integers, "23");
        integers.getClass().getMethod("add", Object.class).invoke(integers, test);
        integers.getClass().getMethod("add", Object.class).invoke(integers, false);

        for (int i = 0;i<integers.size();i++){
            System.out.println(integers.get(i));
        }


    }
}

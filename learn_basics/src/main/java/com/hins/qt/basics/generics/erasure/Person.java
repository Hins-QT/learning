package com.hins.qt.basics.generics.erasure;

/**
 * @author PanHao
 * @date 2022/7/12 10:34
 */

public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

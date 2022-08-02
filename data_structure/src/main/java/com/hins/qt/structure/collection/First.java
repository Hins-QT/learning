package com.hins.qt.structure.collection;

public class First {
    public static void main(String[] args) {


        sum01();
        System.out.println("******************");
        sum02();
    }
    private static void sum01(){
        int target = 1;
        int result = 0;
        while (target<=100){
            result+=target;
            target++;
        }
        System.out.println(result);
    }

    private static void sum02() {
        int max = 100;
        int result = (1+max)*max/2;

        System.out.println(result);
    }
}

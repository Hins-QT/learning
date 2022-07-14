package com.hins.qt.basics.io.stream.easy;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 * @author Hins
 * @date 2022/7/14 23:06
 */

/**
 * 简单的创建stream操作及测试
 */
public class TestForCreateStream {
    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get("E:/workdata/stream/chat.txt")));

        List<String> words = Arrays.asList(contents.split(","));

        //use for or each
        long count = 0L;
        for (String w : words) {
            if (w.length() > 6) {
                count++;
            }
        }

        //use stream
        long streamCount = words.stream().filter(w -> w.length() > 6).count();
        System.out.println(count);
        System.out.println(streamCount);
        //use paraLLelStream
        long parallelStreamCount = words.parallelStream().filter(w -> w.length() > 6).count();
        System.out.println(parallelStreamCount);
    }
}

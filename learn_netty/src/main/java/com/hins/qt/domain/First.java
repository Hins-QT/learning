package com.hins.qt.domain;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author PanHao
 * @date 2022/5/19 14:38
 */
@RestController
@RequestMapping("/learn")
public class First {
    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }
}

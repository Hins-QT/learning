package com.hins.qt.domain;

import com.hins.qt.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author PanHao
 * @date 2022/9/13 11:36
 */
@RestController
@RequestMapping("/redis")
public class RedisController {
    @Autowired
    private RedisUtil redisUtil;

//    public RedisController(RedisUtil redisUtil) {
//        this.redisUtil = redisUtil;
//    }
//
//    public RedisController() {
//    }


    @PostMapping("/insert")
    public void insertKey(String key, String value) {
        redisUtil.set(key, value);
    }

    @GetMapping("/getKey")
    public String getKey(String key) {
        Object result = redisUtil.get(key);
        return result.toString();
    }

    @GetMapping("/test")
    public String test(String key) {

        return key;
    }
}

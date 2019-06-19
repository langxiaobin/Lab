package com.lxb.example.controller;

import com.lxb.example.redis.RedisService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author xiaobin.lang
 * @create 2019-03-21 17:06
 * @desc 线程测试
 **/
public class ThreadTest extends Thread {

    private RedisService redisService;

    public ThreadTest(RedisService redisService){
        this.redisService = redisService;
    }

    public void run() {
        boolean f = redisService.setIfAbsent("aaa",1111);
        System.out.println("获取分布式锁----"+f);
    }
}

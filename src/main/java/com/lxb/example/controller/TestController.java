package com.lxb.example.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lxb.example.model.ContractInfo;
import com.lxb.example.redis.RedisService;
import com.lxb.example.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author xiaobin.lang
 * @create 2019-03-18 10:59
 * @desc 测试controller
 **/
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @Autowired
    RedisService redisService;

    @RequestMapping("hello")
    public String helloworld(){
        return "hello world1111";
    }

    @RequestMapping("getAll")
    public PageInfo<ContractInfo> getAll(){
        PageHelper.startPage(1,5);
        List<ContractInfo> list = testService.getAll();
        PageInfo<ContractInfo> pageInfo = new PageInfo<ContractInfo>(list);

        return pageInfo;
    }

    @RequestMapping("redisTest")
    public String RedisTest(){
        redisService.set("testkey", "111111111111111111111");
        String redislist = redisService.get("testkey").toString();
        System.out.println("redislist=======================");
        System.out.println(redislist);
        return redislist;
    }

    @RequestMapping("lock")
    public void Lock(){
        new ThreadTest(redisService).start();
        new ThreadTest(redisService).start();
    }
}

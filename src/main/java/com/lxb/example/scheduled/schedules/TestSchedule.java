package com.lxb.example.scheduled.schedules;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author xiaobin.lang
 * @create 2019-03-15 11:24
 * @desc 定时器测试类
 **/

@Component
public class TestSchedule {

    @Scheduled(fixedDelay = 1000000)  //定时任务1(********定时表达式见readme***********)
    public void printXXXXXXX(){
        try{
            Thread.sleep(5000);  //睡眠5秒
            System.out.println(Thread.currentThread().getName()); //打印当前线程名字

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Scheduled(fixedDelay = 1000000)  //定时任务2(********定时表达式见readme***********)
    public void printYYYYYYY() {
        try {
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

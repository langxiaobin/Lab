package com.lxb.example.scheduled.schedules;

import com.lxb.example.redis.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.Duration;

/**
 * @author xiaobin.lang
 * @create 2019-03-15 11:24
 * @desc 定时器测试类
 **/

@Component
public class TestSchedule {

    @Autowired
    RedisService redisService;

    private static final String LOCK = "task-job-lock";

    private static final String KEY = "tasklock";


    // 加redis锁，适合集群部署
    @Scheduled(fixedDelay = 10000)  //定时任务1(********定时表达式见readme***********)
    public void printXXXXXXX() {
        boolean lock = false;
        try {
            //设置key有效期，防止不同服务器站点之间时间不同步
            //有效期满足条件：服务器之间时间差< 有效期 < 两次定时任务之间时间间隔
            Duration expiretime = Duration.ofSeconds(5);

            lock = redisService.setIfAbsent(KEY, LOCK, expiretime);
            System.out.println("是否获取到锁:" + lock);
            if (lock) {
                System.out.println(Thread.currentThread().getName()); //打印当前线程名字
            } else {
                System.out.println("没有获取到锁，不执行任务!");
                return;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    // 不加锁，适合单机部署
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

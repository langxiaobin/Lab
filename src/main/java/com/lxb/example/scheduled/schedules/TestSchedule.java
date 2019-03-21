package com.lxb.example.scheduled.schedules;

import com.lxb.example.redis.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

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
    @Scheduled(fixedDelay = 1000000)  //定时任务1(********定时表达式见readme***********)
    public void printXXXXXXX(){
        boolean lock = false;
        try {
            lock = redisService.setIfAbsent(KEY, LOCK);
            System.out.println("是否获取到锁:" + lock);
            if (lock) {
                System.out.println(Thread.currentThread().getName()); //打印当前线程名字
            } else {
                System.out.println("没有获取到锁，不执行任务!");
                return;
            }
        } finally {
            if (lock) {
                redisService.remove(KEY);
                System.out.println("任务结束，释放锁!");
            } else {
                System.out.println("没有获取到锁，无需释放锁!");
            }
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

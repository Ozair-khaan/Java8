package com.javaEight.LearnRedis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;


public class RedisTest {

    @Autowired
    private RedisTemplate redisTemplate;

    void testSendMail(){
//        redisTemplate.opsForValue().set("email", "ozair121@gmail.com");
        Object salary = redisTemplate.opsForValue().get("salary");
    }
}

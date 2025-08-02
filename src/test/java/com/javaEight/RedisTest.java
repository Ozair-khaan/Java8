package com.javaEight;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
public class RedisTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    void testSendMail(){
        redisTemplate.opsForValue().set("email", "ozair121@gmail.com");
        Object salary = redisTemplate.opsForValue().get("salary");
    }
}

package com.squy.springbootdemo.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.squy.springbootdemo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

    @Autowired
    private StringRedisTemplate redisTemplate;

    // JSON转换器
    private static final ObjectMapper mapper = new ObjectMapper();

    @RequestMapping("/saveString")
    public String setString() {
        redisTemplate.opsForValue().set("yyq", "20");
        return redisTemplate.opsForValue().get("yyq");
    }

    @RequestMapping("/savePerson")
    public Person setPerson() throws JsonProcessingException {
        // 存入，自动转化为JSON
        redisTemplate.opsForValue().set("man:100", mapper.writeValueAsString(new Person(0, "雍云清", 19, "INFJ")));
        redisTemplate.opsForValue().set("man:101", mapper.writeValueAsString(new Person(1, "吴恒", 20, "ESFP")));

        // 取出，JSON自动转化为对象
        Person yyq = mapper.readValue(redisTemplate.opsForValue().get("man:100"), Person.class);
        Person wh = mapper.readValue(redisTemplate.opsForValue().get("man:101"), Person.class);

        return wh;
    }

}

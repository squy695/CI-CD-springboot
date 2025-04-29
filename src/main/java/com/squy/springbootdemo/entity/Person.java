package com.squy.springbootdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Options;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("person")

@Component/*表示是一个Bean*/
@ConfigurationProperties(prefix = "person")/*yaml申明以对象的形式注入*/

public class Person {
    @TableId(type= IdType.AUTO)
    private int id;
    private String name;
    private int age;
    private String say;
}

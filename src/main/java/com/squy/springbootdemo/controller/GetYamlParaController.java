package com.squy.springbootdemo.controller;

import com.squy.springbootdemo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*遵循restful风格的控制器*/
@RestController
public class GetYamlParaController {

    /*M1*/
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;
    @Value("${person.say}")
    private String say;

    /*M2*/
    @Autowired
    private Environment env;

    /*M3*/
    @Autowired
    private Person yyq;

    @RequestMapping("/speak")
    public Person speak(){
        //Person yyq=new Person(env.getProperty("person.name"),Integer.parseInt(env.getProperty("person.age")),env.getProperty("person.say"));
        return yyq;
    }

}

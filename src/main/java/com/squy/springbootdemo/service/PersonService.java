package com.squy.springbootdemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.squy.springbootdemo.entity.Person;
import com.squy.springbootdemo.entity.Photo;

import java.util.List;

public interface PersonService extends IService<Person> {
    void add(Person p);
    void del(Integer id);
    void update(Person p);
    public List<Person> findAll();
    public Person findById(Integer id);
}

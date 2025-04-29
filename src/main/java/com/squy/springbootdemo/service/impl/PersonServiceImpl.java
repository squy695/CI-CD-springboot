package com.squy.springbootdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.squy.springbootdemo.entity.Person;
import com.squy.springbootdemo.mapper.PersonMapper;
import com.squy.springbootdemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements PersonService {

    @Autowired
    PersonMapper personMapper;

    @Override
    public void add(Person p){
        personMapper.insert(p);
    }

    @Override
    public void del(Integer id) {
        personMapper.deleteById(id);
    }

    @Override
    public void update( Person p) {
        personMapper.updateById(p);
    }

    @Override
    public List<Person> findAll() {
        return personMapper.selectList(null);
    }

    @Override
    public Person findById(Integer id) {
        return personMapper.selectById(id);
    }


}

package com.squy.springbootdemo.controller;

import com.squy.springbootdemo.entity.Person;
import com.squy.springbootdemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/add")
    public int add(@RequestBody Person p){
        personService.add(p);
        return p.getId();
    }

    @DeleteMapping("/del")
    public void del(Integer id){
        personService.del(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody Person p){
        personService.update(p);
    }

    @GetMapping("/findAll")
    public List<Person> findAll(){
        return personService.findAll();
    }

    @GetMapping("/findById")
    public Person findById(Integer id){
        return personService.findById(id);
    }

}
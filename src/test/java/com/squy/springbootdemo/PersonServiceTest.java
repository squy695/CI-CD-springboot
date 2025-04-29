package com.squy.springbootdemo;

import com.squy.springbootdemo.service.impl.PersonServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/*PersonService的测试类*/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootDemoApplication.class)
public class PersonServiceTest {

    @Autowired
    private PersonServiceImpl ps;

    @Test
    public void testAdd(){
        //ps.add();
    }
}

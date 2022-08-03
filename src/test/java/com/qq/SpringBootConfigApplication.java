package com.qq;

import com.qq.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @program: springboot
 * @description:
 * @author: xiebinbin
 * @create: 2022-08-03 13:56
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootConfigApplication {

    @Autowired
    Person person;

    @Test
    public void contextLoads(){
        System.out.println(person);

    }
}

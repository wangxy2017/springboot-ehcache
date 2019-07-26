package com.wxy.ehcache;

import com.wxy.ehcache.entity.User;
import com.wxy.ehcache.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author wxy
 * @Date 19-7-26 下午5:04
 * @Description TODO
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class UserServiceTest {

    @Autowired
    public UserService userService;

    @Test
    public void TestFindAll() {
        List<User> list = userService.findAll();
        log.info("第一次查询：list = {}", list);
        List<User> list1 = userService.findAll();
        log.info("第二次查询：list1 = {}", list1);
    }

    @Test
    public void TestFindAll2() {
        List<User> list = userService.findAll();
        log.info("第一次查询：list = {}", list);
        int i = userService.saveUser();
        log.info("新增用户：save = {}", i > 0);
        List<User> list1 = userService.findAll();
        log.info("第二次查询：list1 = {}", list1);

    }
}

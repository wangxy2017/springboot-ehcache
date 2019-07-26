package com.wxy.ehcache.service;

import com.wxy.ehcache.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author wxy
 * @Date 19-7-26 下午5:01
 * @Description TODO
 **/
@Service
@Slf4j
public class UserService {

    @Cacheable(value = "users")
    public List<User> findAll() {
        List<User> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            User user = new User();
            user.setId(i);
            user.setName("zhangsan" + i);
            user.setAge(i);
            list.add(user);
        }
        log.info("创建集合数据");
        return list;
    }

    @CacheEvict(value = "users", allEntries = true)
    public int saveUser() {
        return 1;
    }
}

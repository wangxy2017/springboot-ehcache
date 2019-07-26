package com.wxy.ehcache.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author wxy
 * @Date 19-7-26 下午5:00
 * @Description TODO
 **/
@Data
public class User implements Serializable {
    private Integer id;
    private String name;
    private Integer age;
}

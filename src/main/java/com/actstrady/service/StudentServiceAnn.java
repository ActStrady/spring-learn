package com.actstrady.service;

import org.springframework.stereotype.Service;

/**
 * 使用注解注入
 *
 * @author : ActStrady@tom.com
 * @date : 2019/6/11 23:22
 * @fileName : StudentServiceXml.java
 * @gitHub : https://github.com/ActStrady/spring-learn
 */

@Service
public class StudentServiceAnn {

    public String show() {
        return "show";
    }
}

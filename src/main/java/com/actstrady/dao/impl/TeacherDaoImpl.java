package com.actstrady.dao.impl;

import com.actstrady.dao.PeopleDao;
import org.springframework.stereotype.Component;

/**
 * @author : ActStrady@tom.com
 * @date : 2019/6/27 11:36
 * @fileName : TeacherDaoImpl.java
 * @gitHub : https://github.com/ActStrady/spring-learn
 */
@Component
public class TeacherDaoImpl implements PeopleDao {

    @Override
    public void show() {
        System.out.println("TeacherDaoImpl");
    }
}

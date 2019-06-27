package com.actstrady.dao.impl;

import com.actstrady.dao.PeopleDao;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author : ActStrady@tom.com
 * @date : 2019/6/27 23:22
 * @fileName : PeopleDaoImol.java
 * @gitHub : https://github.com/ActStrady/spring-learn
 */
@Component
public class PeopleDaoImpl {
    private final List<PeopleDao> peopleDaos;

    @Autowired
    public PeopleDaoImpl(List<PeopleDao> peopleDaos) {
        this.peopleDaos = peopleDaos;
    }

    @Test
    public void ListTest() {
        if (null != peopleDaos) {
            for (PeopleDao people : peopleDaos) {
                people.show();
                System.out.println(people.getClass().getName() + "" + people.hashCode());
            }
        } else {
            System.out.println("null !!!!!!");
        }
    }
}

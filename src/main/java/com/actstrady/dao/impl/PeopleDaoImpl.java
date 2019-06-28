package com.actstrady.dao.impl;

import com.actstrady.dao.PeopleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.support.TestPropertySourceUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author : ActStrady@tom.com
 * @date : 2019/6/27 23:22
 * @fileName : PeopleDaoImol.java
 * @gitHub : https://github.com/ActStrady/spring-learn
 */
@Component
public class PeopleDaoImpl {
    private final List<PeopleDao> peopleDaoList;
    private final Set<PeopleDao> peopleDaoSet;
    private final Map<String, PeopleDao> peopleDaoMap;

    @Autowired
    public PeopleDaoImpl(List<PeopleDao> peopleDaoList, Set<PeopleDao> peopleDaoSet,
                         Map<String, PeopleDao> peopleDaoMap) {
        this.peopleDaoList = peopleDaoList;
        this.peopleDaoSet = peopleDaoSet;
        this.peopleDaoMap = peopleDaoMap;
    }

    public void beanList() {
        if (null != peopleDaoList) {
            for (PeopleDao people : peopleDaoList) {
                System.out.println(people + ":" + people.hashCode());
            }
        } else {
            System.out.println("List<PeopleDao>null!!!!!!");
        }
    }

    public void beanSet() {
        if (null != peopleDaoSet) {
            for (PeopleDao people : peopleDaoSet) {
                System.out.println(people + ":" + people.hashCode());
            }
        } else {
            System.out.println("Set<PeopleDao>null!!!!!!");
        }
    }

    public void beanMap() {
        if (null != peopleDaoMap) {
            for (Map.Entry<String, PeopleDao> entry : peopleDaoMap.entrySet()) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        } else {
            System.out.println("Map<String, PeopleDao> peopleDaoMap null!!!!!!!!!!!!");
        }
    }
}

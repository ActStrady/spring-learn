package com.actstrady.base;

import org.junit.After;
import org.junit.Before;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

/**
 * @author : ActStrady@tom.com
 * @date : 2019/6/23 18:20
 * @fileName : UnitTestBase.java
 * @gitHub : https://github.com/ActStrady/spring-learn
 */
public class UnitTestBase {
    private ClassPathXmlApplicationContext context;
    private String springXmlPath;

    public UnitTestBase(String springXmlPath) {
        this.springXmlPath = springXmlPath;
    }

    @Before
    public void before() {
        if (StringUtils.isEmpty(springXmlPath)) {
            springXmlPath = "classpath*:spring-*.xml";
        }
        try {
            context = new ClassPathXmlApplicationContext(springXmlPath.split("[,\\s]+"));
            context.start();
        } catch (BeansException e) {
            e.printStackTrace();
        }
    }

    @After
    public void after() {
        context.close();
    }

    @SuppressWarnings("unchecked")
    protected <T> T getBean(String beanId) {
        return (T)context.getBean(beanId);
    }

    protected <T> T getBean(Class<T> cla) {
        return context.getBean(cla);
    }
}

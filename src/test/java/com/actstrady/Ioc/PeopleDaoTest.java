package com.actstrady.Ioc;

import com.actstrady.base.UnitTestBase;
import com.actstrady.dao.impl.PeopleDaoImpl;
import org.junit.Test;

/**
 * 测试注解List类型
 *
 * @author : ActStrady@tom.com
 * @date : 2019/6/27 11:41
 * @fileName : PeopleDaoTest.java
 * @gitHub : https://github.com/ActStrady/spring-learn
 */
public class PeopleDaoTest extends UnitTestBase {
    public PeopleDaoTest() {
        super("classpath*:spring-ioc.xml");
    }

    @Test
    public void testIt() {
        PeopleDaoImpl bean = super.getBean(PeopleDaoImpl.class);
        bean.ListTest();
    }
}

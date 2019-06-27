package com.actstrady.Ioc;

import com.actstrady.base.UnitTestBase;
import com.actstrady.service.StudentServiceAnn;
import com.actstrady.service.StudentServiceXml;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class StudentIocTest extends UnitTestBase {
    public StudentIocTest() {
        super("classpath*:spring-ioc.xml");
    }

    @Test
    public void testXml() {
        StudentServiceXml studentServiceXml = super.getBean("studentServiceXml");
        System.out.println(studentServiceXml.show());
    }

    @Test
    public void testAnn() {
        StudentServiceAnn studentServiceAnn = super.getBean(StudentServiceAnn.class);
        System.out.println(studentServiceAnn.show());
    }
}
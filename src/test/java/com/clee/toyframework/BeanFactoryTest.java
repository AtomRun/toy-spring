package com.clee.toyframework;

import com.clee.toyframework.model.TestBean;
import junit.framework.TestCase;

public class BeanFactoryTest extends TestCase {

    BeanFactory beanFactory = new BeanFactory();
    TestBean testBean = new TestBean("张三", 19);

    public void testGetBean() {
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBean(testBean);
        beanFactory.registerBean("testBean", beanDefinition);

        TestBean bean = (TestBean) beanFactory.getBean("testBean").getBean();
        assertEquals(bean, testBean);
    }
}
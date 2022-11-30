package com.clee.toyframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 获取bean的工厂 1. 注册bean到容器中 2. 从容器中获取一个bean
 *
 * @author 李闯
 * @since 28/11/2022 下午5:03
 */
public class BeanFactory {

    /**
     * 存放Bean的容器
     */
    private final Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();


    public BeanDefinition getBean(String beanName) {
        return beanDefinitionMap.get(beanName);
    }

    public void registerBean(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }
}

package com.ez.springlifecycle.process;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Classname MyBeanPostProcessor
 * @Description TODO
 * @Author Elon.Zhang
 * @Date 2024/6/26
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("lifeBean")) {
			System.out.println("执行初始化前置方法");
		}
		return bean;
	}
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("lifeBean")) {
			System.out.println("执行初始化后置方法");
		}
		return bean;
	}
}

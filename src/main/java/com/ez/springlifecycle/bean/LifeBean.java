package com.ez.springlifecycle.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

/**
 * @Classname LifeBean
 * @Description TODO
 * @Author Elon.Zhang
 * @Date 2024/6/26
 */
@Component
public class LifeBean implements BeanNameAware {

	@Override
	public void setBeanName(String name) {

		System.out.println("执行BeanName的通知方法");
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("执行初始化方法");
	}
	public void use() {
		System.out.println("使用Bean");
	}
	@PreDestroy
	public void preDestroy() {
		System.out.println("执行销毁方法");
	}
}

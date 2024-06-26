package com.ez.springlifecycle;

import com.ez.springlifecycle.bean.LifeBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringLifecycleApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(SpringLifecycleApplication.class, args);
		// 获取bean
		LifeBean bean = (LifeBean) ctx.getBean(LifeBean.class);
		// 使用bean
		bean.use();
		// 停止SpringBoot项目
		ctx.close();
	}

}

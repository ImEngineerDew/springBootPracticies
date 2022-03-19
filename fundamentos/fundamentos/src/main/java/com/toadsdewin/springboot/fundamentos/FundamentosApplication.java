package com.toadsdewin.springboot.fundamentos;

import com.toadsdewin.springboot.fundamentos.Beans.MyBean;
import com.toadsdewin.springboot.fundamentos.Beans.MyBeanWithProperties;
import com.toadsdewin.springboot.fundamentos.Component.ComponentDependency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	private ComponentDependency componentDependency;
	private MyBean myBean;

	private MyBeanWithProperties myBeanWithProperties;

	@Autowired
	public FundamentosApplication(@Qualifier("componentSecondImplement") ComponentDependency componentDependency, MyBean myBean, MyBeanWithProperties myBeanWithProperties)
	{
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.myBeanWithProperties = myBeanWithProperties;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args)
	{
		componentDependency.saluteMessage();
		myBean.printMessage();
		System.out.println(myBeanWithProperties.function());
	}

}

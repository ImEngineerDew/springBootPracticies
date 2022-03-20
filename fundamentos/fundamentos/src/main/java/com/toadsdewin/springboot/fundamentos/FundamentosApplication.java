package com.toadsdewin.springboot.fundamentos;

import com.toadsdewin.springboot.fundamentos.Beans.MyBean;
import com.toadsdewin.springboot.fundamentos.Beans.MyBeanWithProperties;
import com.toadsdewin.springboot.fundamentos.Component.ComponentDependency;
import com.toadsdewin.springboot.fundamentos.Entity.User;
import com.toadsdewin.springboot.fundamentos.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	private ComponentDependency componentDependency;
	private MyBean myBean;

	private MyBeanWithProperties myBeanWithProperties;

	private UserRepository userRepository;

	@Autowired
	public FundamentosApplication(@Qualifier("componentSecondImplement") ComponentDependency componentDependency, MyBean myBean, MyBeanWithProperties myBeanWithProperties, UserRepository userRepository)
	{
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.myBeanWithProperties = myBeanWithProperties;
		this.userRepository = userRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args)
	{
		//componentDependency.saluteMessage();
		//myBean.printMessage();
		//System.out.println(myBeanWithProperties.function());
		saveUsersInDB();
	}

	private void saveUsersInDB()
	{
		User user1 = new User("Carlota Manrique","carmanrui1987@post.com", LocalDate.of(1987,07,29));
		User user2 = new User("Amanda Manrique","amymarvi@post.com", LocalDate.of(1992,03,11));
		User user3 = new User("Laura Lozano","lozano.orjuela@post.com", LocalDate.of(1995,06,15));

		List<User> list = Arrays.asList(user1,user2,user3);
		list.stream().forEach(userRepository:: save);
	}

}

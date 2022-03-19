package com.toadsdewin.springboot.fundamentos.Config;

import com.toadsdewin.springboot.fundamentos.Beans.BeanImplement;
import com.toadsdewin.springboot.fundamentos.Beans.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean
{
    @Bean
    public MyBean beanOperation()
    {
       return new BeanImplement();
    }
}

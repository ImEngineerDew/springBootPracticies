package com.toadsdewin.springboot.fundamentos.Config;

import com.toadsdewin.springboot.fundamentos.Beans.MyBeanWithProperties;
import com.toadsdewin.springboot.fundamentos.Beans.MyBeanWithPropertiesImplement;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.BeanProperty;

@Configuration
public class ConfGeneral
{
    @Value("${value.name}")
    private String name;

    @Value("${value.surname}")
    private String surname;

    @Value ("${value.random}")
    private String random;

    @Bean
    public MyBeanWithProperties function()
    {
        return new MyBeanWithPropertiesImplement(name,surname);
    }
}

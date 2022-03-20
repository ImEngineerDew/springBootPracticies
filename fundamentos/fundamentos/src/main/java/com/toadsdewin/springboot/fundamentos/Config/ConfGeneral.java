package com.toadsdewin.springboot.fundamentos.Config;

import com.toadsdewin.springboot.fundamentos.Beans.MyBeanWithProperties;
import com.toadsdewin.springboot.fundamentos.Beans.MyBeanWithPropertiesImplement;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
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

    @Bean
    public DataSource dataSource()
    {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.h2.Driver");
        dataSourceBuilder.url("jdbc:h2:men:testdb");
        dataSourceBuilder.username("sa");
        dataSourceBuilder.password("");

        return dataSourceBuilder.build();
    }
}

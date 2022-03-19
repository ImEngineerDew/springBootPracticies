package com.toadsdewin.springboot.fundamentos.Component;

import org.springframework.stereotype.Component;

@Component
public class ComponentImplement implements ComponentDependency
{
    @Override
    public void saluteMessage()
    {
        System.out.println("Buenas noches a todos!");
    }

}

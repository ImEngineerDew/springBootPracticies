package com.toadsdewin.springboot.fundamentos.Component;

import org.springframework.stereotype.Component;

@Component
public class ComponentSecondImplement implements  ComponentDependency
{
    @Override
    public void saluteMessage()
    {
        System.out.println("This is the second message!");
    }
}

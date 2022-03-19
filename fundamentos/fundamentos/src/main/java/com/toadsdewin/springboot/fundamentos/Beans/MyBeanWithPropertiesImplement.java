package com.toadsdewin.springboot.fundamentos.Beans;

public class MyBeanWithPropertiesImplement implements MyBeanWithProperties
{
    private String name;
    private String surname;

    public MyBeanWithPropertiesImplement(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
    }
    @Override
    public String function()
    {
        return "Name: "+name+" \nSurname: "+surname;
    }
}

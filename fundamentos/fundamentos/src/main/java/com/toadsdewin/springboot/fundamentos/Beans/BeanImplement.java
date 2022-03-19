package com.toadsdewin.springboot.fundamentos.Beans;

public class BeanImplement implements MyBean
{
    @Override
    public void printMessage()
    {
        System.out.println("Implementando desde el bean!");
    }
}

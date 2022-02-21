package com.toadsdewin.users.UserModel;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserModel 
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surname;
    private Integer age;
    private double height;

    /*Getters*/    
    public Long getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public String getSurname()
    {
        return surname;
    }
    public Integer getAge()
    {
        return age;
    }
    public double getHeight()
    {
        return height;
    }

    /*Setters*/
    public void setId(Long id)
    {
        this.id = id;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setSurname(String surname)
    {
        this.surname = surname;
    }
    public void setAge(Integer age)
    {
        this.age = age;
    }
    public void setHeight(double height)
    {
        this.height = height;
    }


}

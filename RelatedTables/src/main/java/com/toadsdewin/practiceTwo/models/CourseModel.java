package com.toadsdewin.practiceTwo.models;
import javax.persistence.*;

@Entity
@Table(name= "courses")
public class CourseModel 
{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(unique= true , nullable= false)
    
    private Long Id;
    private String name;
    private String description;


    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }

    public Long getId()
    {
        return Id;
    }

    public void setId(Long Id)
    {
        this.Id = Id;
    }
}

package com.toadsdewin.practiceOne.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")

public class usersModel 
{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long ID;
    private String name;
    private String surname;
    private Integer points;
    
    public Long getID() {
        return ID;
    }
    public void setID(Long iD) {
        ID = iD;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public Integer getPoints() {
        return points;
    }
    public void setPoints(Integer points) {
        this.points = points;
    }

    
    
}

package com.toadsdewin.StudentRelated.models;
import javax.persistence.*;

@Entity
@Table(name = "courses")
public class CourseModel
{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (unique = true , nullable = false)

    private Long id;
    private String name;
    private String description;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
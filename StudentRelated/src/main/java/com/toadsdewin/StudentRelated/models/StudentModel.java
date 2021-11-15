package com.toadsdewin.StudentRelated.models;
import javax.persistence.*;

@Entity
@Table(name = "students")
public class StudentModel
{
     @Id
     @Column
     private Long id;
     private String name;
     private String surname;

     @ManyToOne
     private CourseModel course;

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

     public String getSurname() {
          return surname;
     }

     public void setSurname(String surname) {
          this.surname = surname;
     }

     public CourseModel getCourse() {
          return course;
     }

     public void setCourse(CourseModel course) {
          this.course = course;
     }
}
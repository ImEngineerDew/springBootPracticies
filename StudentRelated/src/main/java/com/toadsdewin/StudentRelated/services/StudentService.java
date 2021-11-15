package com.toadsdewin.StudentRelated.services;
import com.toadsdewin.StudentRelated.models.StudentModel;
import com.toadsdewin.StudentRelated.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class StudentService
{
    @Autowired
    StudentRepository studentRepository;

    public ArrayList <StudentModel> getStudent()
    {
        return (ArrayList<StudentModel>) studentRepository.findAll();
    }
    public StudentModel setStudent(StudentModel student)
    {
        return studentRepository.save(student);
    }
}

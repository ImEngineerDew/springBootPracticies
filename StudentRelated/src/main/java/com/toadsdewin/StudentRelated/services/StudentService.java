package com.toadsdewin.StudentRelated.services;
import com.toadsdewin.StudentRelated.models.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService
{
    @Autowired
    StudentModel studentRepo;
}

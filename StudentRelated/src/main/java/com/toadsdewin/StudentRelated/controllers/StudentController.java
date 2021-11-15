package com.toadsdewin.StudentRelated.controllers;
import com.toadsdewin.StudentRelated.models.StudentModel;
import com.toadsdewin.StudentRelated.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/student")
public class StudentController
{

    @Autowired
    StudentService studentService;

    //Calling the method of service
    @GetMapping //HTTPS method
    public ArrayList<StudentModel> getStudent()
    {
        return studentService.getStudent();
    }


}

package com.toadsdewin.StudentRelated.controllers;
import com.toadsdewin.StudentRelated.models.CourseModel;
import com.toadsdewin.StudentRelated.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
@RequestMapping("/course")
public class CourseController
{
    @Autowired
    CourseService courseService;

    public ArrayList<CourseModel> getCourse()
    {
        return courseService.getCourse();
    }
}

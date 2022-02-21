package com.toadsdewin.StudentRelated.controllers;
import com.toadsdewin.StudentRelated.models.CourseModel;
import com.toadsdewin.StudentRelated.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/course")
public class CourseController
{
    @Autowired
    CourseService courseService;

    @GetMapping
    public ArrayList<CourseModel> getCourse()
    {
        return courseService.getCourse();
    }

    @PostMapping
    public CourseModel setCourse(@RequestBody CourseModel course)
    {
        return courseService.setCourse(course);
    }
}

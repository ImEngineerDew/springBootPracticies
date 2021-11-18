package com.toadsdewin.StudentRelated.services;
import com.toadsdewin.StudentRelated.models.CourseModel;
import com.toadsdewin.StudentRelated.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class CourseService
{
    @Autowired
    CourseRepository courseRepository;

    public ArrayList<CourseModel> getCourse()
    {
        return (ArrayList<CourseModel>) courseRepository.findAll();
    }
    public CourseModel setCourse(CourseModel course)
    {
        return courseRepository.save(course);
    }
}

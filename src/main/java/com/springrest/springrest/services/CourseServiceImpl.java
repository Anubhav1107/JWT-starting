package com.springrest.springrest.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Courses;



@Service
public class CourseServiceImpl implements CourseService
{
    @Autowired
    private CourseDao courseDao;

    
    @Override
    public List<Courses> getCourses()
    {
        // return list;
        return courseDao.findAll();
    }
    
    @Override
    public Courses getCourse(long courseId)
    {
        
        return courseDao.getReferenceById(courseId);

    }

    @Override
    public Courses addCourses(Courses kourse)
    {

        courseDao.save(kourse);
        return kourse;
    }

    @Override
    public Courses updateCourses(Courses course)
    {
        
        courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourses(long courseId) 
    {
        // list.removeIf(course ->course.getId()==courseId);
        Courses ent = courseDao.getReferenceById(courseId);
        courseDao.delete(ent);

    };  
    }

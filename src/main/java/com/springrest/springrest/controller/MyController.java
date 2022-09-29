package com.springrest.springrest.controller;

import java.util.List;

import com.springrest.springrest.entities.Courses;
import com.springrest.springrest.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {

    @Autowired
    private CourseService courseserv;

    @GetMapping("/home")
    public String home() 
    {
        return "Welcome to This Project";
    }


    @GetMapping("/courses")
    public List<Courses> getCourses()
    {
        return this.courseserv.getCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Courses getCourse(@PathVariable String courseId)
    {
        return this.courseserv.getCourse(Long.parseLong(courseId));
    }

    @PostMapping(path = "/courses",consumes = "application/json")
    public Courses addCourses(@RequestBody Courses course) 
    {
        return this.courseserv.addCourses(course);
    }

    //update course
    @PutMapping(path = "/courses", consumes = "application/json")
    public Courses updateCourses(@RequestBody Courses course)
    {
        return this.courseserv.updateCourses(course);
    }

    @DeleteMapping(path = "/courses/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId)
    {
        try
        {
            this.courseserv.deleteCourses(Long.parseLong(courseId));
            return new ResponseEntity<>(HttpStatus.OK);
        
        }catch(Exception E){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

        }   
    }
}



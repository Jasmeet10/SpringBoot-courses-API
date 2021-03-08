package com.example.courseapi.Courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/topics/{id}/courses")
    public List<Courses> allCourses(){
        return courseService.getAllCourses();
    }

    @RequestMapping("/topics{id}/courses/{id}")
    public Courses getCourse(@PathVariable String id){
        return courseService.getCourses(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/Courses")
    public void addCourse(@RequestBody Courses course){
        courseService.addCourse(course);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/Courses/{id}")
    public void updateCourse(@RequestBody Courses course, @PathVariable String id){
        courseService.updateCourse(course,id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/Courses/{id}")
    public void deleteCourse(@PathVariable String id){
        courseService.deleteCourse(id);
    }
}

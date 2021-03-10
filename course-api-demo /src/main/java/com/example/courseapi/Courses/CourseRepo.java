package com.example.courseapi.Courses;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepo extends CrudRepository<Courses,String> {
    public List<Courses> findByTopicId(String topicId);
}

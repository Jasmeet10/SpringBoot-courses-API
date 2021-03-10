package com.example.courseapi.Courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepo courseRepo;

//    private List<Topics> topics = new ArrayList<>(Arrays.asList(
//            new Topics("java" ,"Core Java","Basics of Java"),
//            new Topics("javascript" ,"Java Script" , "Basics of Java Script")
//    ));


    public List<Courses> getAllCourses(String topicId){
       // return com.example.courseapi.topics;
        List<Courses> courses = new ArrayList<>();
        courseRepo.findByTopicId(topicId).forEach(courses :: add);
        return courses;
    }
    public Courses getCourses(String id){
         return courseRepo.findById(id).get();
        //return com.example.courseapi.topics.stream().filter(x->x.getId().equals(id)).findFirst().get();
    }


    public void addCourse(Courses course) {
        //com.example.courseapi.topics.add(topic);
        courseRepo.save(course);
    }

    public void updateCourse(Courses course) {
//       for(int i = 0; i< com.example.courseapi.topics.size();i++){
//           Topics t = com.example.courseapi.topics.get(i);
//           if(t.getId().equals(id)){
//               com.example.courseapi.topics.set(i,topic);
//               return;
//           }
//       }
        courseRepo.save(course);
    }

    public void deleteCourse(String id) {
//        for(int i = 0 ; i<com.example.courseapi.topics.size(); i++){
//            Topics t = com.example.courseapi.topics.get(i);
//            if(t.getId().equals(id)){
//                com.example.courseapi.topics.remove(t);
//            }
//        }
//        Topics t = topicRepo.findById(id).get();
//        topicRepo.delete(t);
        courseRepo.deleteById(id);
    }
}

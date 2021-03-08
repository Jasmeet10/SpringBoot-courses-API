package com.example.courseapi.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepo topicRepo;

//    private List<Topics> topics = new ArrayList<>(Arrays.asList(
//            new Topics("java" ,"Core Java","Basics of Java"),
//            new Topics("javascript" ,"Java Script" , "Basics of Java Script")
//    ));


    public List<Topics> getAllTopics(){
       // return com.example.courseapi.topics;
        List<Topics> t = new ArrayList<>();
        topicRepo.findAll().forEach(t :: add);
        return t;
    }
    public Topics getTopics(String id){
         return topicRepo.findById(id).get();
        //return com.example.courseapi.topics.stream().filter(x->x.getId().equals(id)).findFirst().get();
    }


    public void addTopic(Topics topic) {
        //com.example.courseapi.topics.add(topic);
        topicRepo.save(topic);
    }

    public void updateTopic(Topics topic, String id) {
//       for(int i = 0; i< com.example.courseapi.topics.size();i++){
//           Topics t = com.example.courseapi.topics.get(i);
//           if(t.getId().equals(id)){
//               com.example.courseapi.topics.set(i,topic);
//               return;
//           }
//       }
        topicRepo.save(topic);
    }

    public void deleteTopic(String id) {
//        for(int i = 0 ; i<com.example.courseapi.topics.size(); i++){
//            Topics t = com.example.courseapi.topics.get(i);
//            if(t.getId().equals(id)){
//                com.example.courseapi.topics.remove(t);
//            }
//        }
//        Topics t = topicRepo.findById(id).get();
//        topicRepo.delete(t);
        topicRepo.deleteById(id);
    }
}

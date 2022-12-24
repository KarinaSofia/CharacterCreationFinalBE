package com.example.charactercreation.service;

import com.example.charactercreation.entity.Story;
import com.example.charactercreation.exception.ResourceNotFound;
import com.example.charactercreation.repository.StoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class StoryService {
@Autowired
private StoryRepository storyRepository;

    public Story getStory(long storyId){
        Story story = storyRepository.findById(storyId).orElseThrow(() ->new ResourceNotFound("course id not found"));
        return story;
    }
/*
public Course getCourse(long courseId)
    {
        Course course = courseRepository.findById(courseId).orElseThrow(()->new ResourceNotFoundException("course id not found"));
        return course;
    }

    public Course updateCourse(long courseId, CourseRequest courseRequest){
        if(courseRepository.existsById(courseId))
        {
            Course courseToBeUpdated = new Course(courseRequest);
            courseToBeUpdated.setId(courseId);
            return courseRepository.save(courseToBeUpdated);
        }
        else{
            throw new ResourceNotFoundException("course id not found");
        }
    }

    public void deleteCourse(long courseId){
        if(courseRepository.existsById(courseId)){
            courseRepository.deleteById(courseId);
        }
        else{
            throw new ResourceNotFoundException("course id not found");

        }
    }
}

 */

}

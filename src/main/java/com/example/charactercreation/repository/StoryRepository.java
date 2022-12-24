package com.example.charactercreation.repository;

import com.example.charactercreation.entity.Character;
import com.example.charactercreation.entity.Story;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoryRepository extends CrudRepository<Story, Long> {

/*
    public List<Course> findAllByTeacherId(long teacher_id);
    @Transactional
    void deleteAllByTeacherId(long teacherId);
 */
}

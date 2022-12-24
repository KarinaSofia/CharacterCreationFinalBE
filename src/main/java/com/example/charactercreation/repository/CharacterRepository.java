package com.example.charactercreation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.charactercreation.entity.Character;

import java.util.List;

@Repository
public interface CharacterRepository extends CrudRepository <Character, Long> {
    List<Character> findAllByFirstNameIgnoreCase(String firstName);

}

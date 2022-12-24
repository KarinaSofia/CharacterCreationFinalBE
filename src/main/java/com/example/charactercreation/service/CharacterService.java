package com.example.charactercreation.service;

import com.example.charactercreation.entity.Character;
import com.example.charactercreation.exception.ResourceNotFound;
import com.example.charactercreation.repository.CharacterRepository;
import com.example.charactercreation.request.CharacterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterService {
    @Autowired
    CharacterRepository characterRepository;

    public List<Character> getAllCharacters(){

        return (List<Character>) characterRepository.findAll();

    }

    public Character addCharacter(CharacterRequest characterRequest)
    {
        Character character = new Character(characterRequest);

        return characterRepository.save(character);
    }


    public Character updateCharacter(long characterId, CharacterRequest characterRequest)
    {
        characterRepository.findById(characterId)
                .orElseThrow(()->new ResourceNotFound("teacher id is not found"));

        Character characterToBeUpdated = new Character(characterRequest);
        characterToBeUpdated.setId(characterId);

        return characterRepository.save(characterToBeUpdated);

    }
}

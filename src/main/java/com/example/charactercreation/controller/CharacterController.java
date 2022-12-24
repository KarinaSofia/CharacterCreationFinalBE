package com.example.charactercreation.controller;

import com.example.charactercreation.entity.Character;
import com.example.charactercreation.request.CharacterRequest;
import com.example.charactercreation.response.CharacterResponse;
import com.example.charactercreation.service.CharacterService;
import com.example.charactercreation.repository.CharacterRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/characters")
public class CharacterController {
    @Autowired
    CharacterService characterService;

    @GetMapping()
    public List<CharacterResponse> getAllCharacters(){
        List<Character> characters = characterService.getAllCharacters();

        List<CharacterResponse> characterResponse = new ArrayList<>();
        characters.forEach(character -> {
            characterResponse.add(new CharacterResponse(character));
        });

        return characterResponse;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public CharacterResponse addCharacter(@Valid @RequestBody CharacterRequest characterRequest)
    {

        Character savedCharacter = characterService.addCharacter(characterRequest);

        return new CharacterResponse(savedCharacter);

    }

    @PutMapping("/{id}")
    public CharacterResponse updateCharacter(@PathVariable long id, @Valid @RequestBody CharacterRequest characterRequest){
        Character updatedCharacter = characterService.updateCharacter(id,characterRequest);
        return new CharacterResponse(updatedCharacter);

    }




}

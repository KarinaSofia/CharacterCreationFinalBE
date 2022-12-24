package com.example.charactercreation.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class CharacterRequest {
    @NotBlank
    private String firstName;

    private String last_Name;
    private String nickName;
    private int age;
    private String gender;
    private String primaryPersonalityTrait;
    private String primaryAccessory;
    private String height;
    private String weight;
    private String eyeColor;
    private String hairColor;
    private String skinColor;
    private String residence;
    private String ethnicity;
    private String occupation;

    private StoryRequest story;
}

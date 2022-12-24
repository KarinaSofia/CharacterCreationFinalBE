package com.example.charactercreation.entity;


import com.example.charactercreation.request.CharacterRequest;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name="characters")
@Getter
@Setter
@NoArgsConstructor
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="firstName", nullable = false)
    private String firstName;


    @Column(name="LastName")
    private String LastName;

    @Column(name="NickName")
    private String NickName;

    @Column(name="Age")
    private int Age;

    @Column(name="Gender")
    private String Gender;

    @Column(name="PrimaryPersonalityTrait")
    private String PrimaryPersonalityTrait;

    @Column(name="PrimaryAccessory")
    private String PrimaryAccessory;

    @Column(name="Height")
    private String Height;

    @Column(name="Weight")
    private String Weight;

    @Column(name="EyeColor")
    private String EyeColor;

    @Column(name="HairColor")
    private String HairColor;

    @Column(name="SkinColor")
    private String SkinColor;

    @Column(name="Residence")
    private String Residence;

    @Column(name="Ethnicity")
    private String Ethnicity;

    @Column(name="Occupation")
    private String Occupation;

    @ManyToOne(optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name="story_id")
    private Story story;




    public Character(CharacterRequest characterRequest){
        firstName = characterRequest.getFirstName();

        LastName = characterRequest.getLast_Name();
        Age = characterRequest.getAge();
        Gender = characterRequest.getGender();;
        PrimaryPersonalityTrait = characterRequest.getPrimaryPersonalityTrait();
        PrimaryAccessory = characterRequest.getPrimaryAccessory();
        Height = characterRequest.getHeight();
        Weight = characterRequest.getWeight();
        EyeColor = characterRequest.getEyeColor();
        HairColor = characterRequest.getHairColor();
        SkinColor = characterRequest.getSkinColor();
        Residence = characterRequest.getResidence();
        Ethnicity = characterRequest.getEthnicity();
        Occupation = characterRequest.getOccupation();



    }

}



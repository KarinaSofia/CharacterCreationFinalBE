package com.example.charactercreation.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.List;

@Entity
@Table(name = "stories")
@Getter
@Setter
@NoArgsConstructor
public class Story {

        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @Column(name = "name")
        private String name;

        @Column(name = "genre")
        private String genre;

        @Column(name = "desc")
        private String desc;


}

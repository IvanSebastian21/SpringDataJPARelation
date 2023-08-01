package com.jpa.SpringJpaRelation.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name="last_name")
    private String lastName;
    private String nationality;
    private String position;
    private Integer age;

    @ManyToOne(targetEntity = Club.class)
    @JoinColumn(name = "id_club")
    private Club club;
}

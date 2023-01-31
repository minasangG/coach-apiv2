package com.clark.coachapi.entity;

import com.clark.coachapi.entity.Enums.TrainingAvailability;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Player")
public class Player {

    @Id
    @SequenceGenerator(name = "player_sequence",
            sequenceName = "player_sequence",
            initialValue = 1,
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "player_sequence")
    @Column(name = "id", nullable = false)
    private Long id;

    @NotBlank(message = "First Name should not be blank")
    @Column(name = "player_first_name")
    private String firstName;

    @NotBlank(message = "Last Name should not be blank")
    @Column(name = "player_last_name")
    private String lastName;

    @NotBlank(message = "Contact Number should not be blank")
    @Column(name = "contact_number")
    private String contactNumber;

    @NotBlank(message = "Sex should not be blank")
    @Column(name = "sex")
    private String sex;

    @OneToMany //(cascade = cascadeType.ALL, mappedBy = "coach")
    private List<Player> players;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "patient")
    private List<Training> trainings;
}

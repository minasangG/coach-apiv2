package com.clark.coachapi.entity;

import com.clark.coachapi.entity.Enums.TrainingAvailability;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import java.util.List;
//import javax.persistence.*;


@Entity
@Getter
@Setter
@Table(name = "Coach")

public class Coach {
    @Id
    @SequenceGenerator(name = "coach_sequence",
            sequenceName = "coach_sequence",
            initialValue = 1,
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "coach_sequence")
    @Column(name = "id", nullable = false)
    private Long id;

    @NotBlank(message = "First Name should not be blank")
    @Column(name = "coach_first_name")
    private String firstName;

    @NotBlank(message = "Last Name should not be blank")
    @Column(name = "coach_last_name")
    private String lastName;

    @OneToMany //(cascade = cascadeType.ALL, mappedBy = "coach")
    private List<Player> players;

    @Enumerated(value = EnumType.STRING)
    private TrainingAvailability availability;


}

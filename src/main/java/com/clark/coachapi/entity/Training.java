package com.clark.coachapi.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Data
@Table(name = "Training")
public class Training {

    @Id
    @SequenceGenerator(
            name = "training_sequence",
            sequenceName = "training_sequence",
            allocationSize= 1,
            initialValue = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long trainingId;

    @NotBlank(message = "Appointment Date could not be left blank")
    private String appointmentDate;

    @NotBlank(message = "Appointment Time could not be left blank")
    private String appointmentTime;

    @ManyToOne
    @JoinColumn(name = "doctor_id", referencedColumnName = "doctorId")
    @JsonIgnore
    private Coach coach;

    @ManyToOne
    @JoinColumn(name = "player_id", referencedColumnName = "playerId")
    private Player player;


}

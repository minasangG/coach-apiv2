package com.clark.coachapi.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name = "Training")
public class Training {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long trainingId;
    //

}

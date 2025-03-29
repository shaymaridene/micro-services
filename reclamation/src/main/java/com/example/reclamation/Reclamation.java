package com.example.reclamation;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Reclamation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_rec;
    @Enumerated(EnumType.STRING)
    private TypeRec typeRec;
    @Enumerated(EnumType.STRING)
    private Status status;

    private String description;
    private int id_rec_user;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation = new Date();
}

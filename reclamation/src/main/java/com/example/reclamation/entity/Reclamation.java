package com.example.reclamation.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;


@Data
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
    private String client;
    private String email;
    @Enumerated(EnumType.STRING)
    private TypeRec typeRec;
    @Enumerated(EnumType.STRING)
    private Status status;
    private String description;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation = new Date();
}

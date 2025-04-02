package com.example.reclamation.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter

public class UserDTO {
    private Long id;
    private String firstName;
    private String lastName;
}

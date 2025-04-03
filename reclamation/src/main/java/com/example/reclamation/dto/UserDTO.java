package com.example.reclamation.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)

public class UserDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String permissions;
    private String email;

    public String getName() {
        return firstName + " " + lastName;
    }


}

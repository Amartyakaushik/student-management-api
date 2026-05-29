package com.example.student_management_api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentResponseDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
}

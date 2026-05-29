package com.example.student_management_api.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class StudentRequestDTO {

    @NotBlank(message = "First name is required")
    private String firstName;

    @NotBlank(message = "Last name is required")
    private String lastName;

    @NotBlank(message = "Email is required")
    @Email(message = "Email should be valid")
    private String email;

    @Min(value = 1, message = "Age must be at least 1")
    @Max(value = 120, message = "Age must be at most 120")
    private int age;
}

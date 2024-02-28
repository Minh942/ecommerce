package com.ecommerce.library.dto;

import jakarta.validation.constraints.Size;

public class AdminDto {
    @Size(min = 3, max = 10, message = "Invalid first name! (3-10 characters)")
    private String firstName;
    @Size(min = 3, max = 10, message = "Invalid last name! (3-10 characters)")
    private String lastName;
    @Size(min = 6, max = 15, message = "Invalid user name! (6-15 characters)")
    private String userName;
    @Size(min = 6, max = 15, message = "Invalid password! (6-15 characters)")
    private String password;
    private String repeatPassword;
}

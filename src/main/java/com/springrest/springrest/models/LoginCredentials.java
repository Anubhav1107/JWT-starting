package com.springrest.springrest.models;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class LoginCredentials {

    private String email;
    private String password;
    
}

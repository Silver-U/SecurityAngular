package com.Silver.Security.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
public class RegisterRequest {
    private String firstname;
    private String email;
    private  String lastname;
    private String password;
}

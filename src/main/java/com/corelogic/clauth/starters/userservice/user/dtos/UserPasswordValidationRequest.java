package com.corelogic.clauth.starters.userservice.user.dtos;

import org.hibernate.validator.constraints.NotEmpty;

public class UserPasswordValidationRequest {
    @NotEmpty(
            message = "username must be defined"
    )
    private String username;
    @NotEmpty(
            message = "password must be defined"
    )
    private String password;

    public UserPasswordValidationRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }
}
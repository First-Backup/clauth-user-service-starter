package com.corelogic.clauth.starters.userservice.user.dtos;

import org.hibernate.validator.constraints.NotEmpty;

public class PasswordComplexityRequest {
    @NotEmpty(
            message = "The token is required"
    )
    private String token;
    @NotEmpty(
            message = "The password is required"
    )
    private String password;

    public PasswordComplexityRequest(String token, String password) {
        this.token = token;
        this.password = password;
    }

    public String getToken() {
        return this.token;
    }

    public String getPassword() {
        return this.password;
    }
}
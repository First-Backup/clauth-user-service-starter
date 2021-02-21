package com.corelogic.clauth.starters.userservice.user.dtos;

public class ExtendedUserResponse extends UserResponse {
    private String applicationCode;

    public ExtendedUserResponse() {
    }

    public String getApplicationCode() {
        return this.applicationCode;
    }

    public void setApplicationCode(String applicationCode) {
        this.applicationCode = applicationCode;
    }
}
package com.corelogic.clauth.starters.userservice.user.dtos;

public class UpdatePasswordResponseDto {
    private String login;

    public UpdatePasswordResponseDto() {
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
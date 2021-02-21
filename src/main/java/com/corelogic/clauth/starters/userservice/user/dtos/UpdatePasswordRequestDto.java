package com.corelogic.clauth.starters.userservice.user.dtos;

public class UpdatePasswordRequestDto {
    private String login;
    private String currentPassword;
    private String newPassword;

    public UpdatePasswordRequestDto() {
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return this.login;
    }

    public void setCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
    }

    public String getCurrentPassword() {
        return this.currentPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getNewPassword() {
        return this.newPassword;
    }
}
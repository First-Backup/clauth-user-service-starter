package com.corelogic.clauth.starters.userservice.user.dtos;

import java.util.List;

public class UsersRequest {
    private List<UserRequest> users;
    private String applicationCode;
    private String applicationName;
    private String customCreateUserEmailText;

    public UsersRequest() {
    }

    public void setUsers(List<UserRequest> users) {
        this.users = users;
    }

    public List<UserRequest> getUsers() {
        return this.users;
    }

    public void setApplicationCode(String applicationCode) {
        this.applicationCode = applicationCode;
    }

    public String getApplicationCode() {
        return this.applicationCode;
    }

    public String getApplicationName() {
        return this.applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getCustomCreateUserEmailText() {
        return this.customCreateUserEmailText;
    }

    public void setCustomCreateUserEmailText(String customCreateUserEmailText) {
        this.customCreateUserEmailText = customCreateUserEmailText;
    }
}
package com.corelogic.clauth.starters.userservice.user.dtos;

public class ExtendedUserRequest extends UserRequest {
    private String applicationCode;
    private String applicationName;
    private String customCreateUserEmailText;

    public ExtendedUserRequest() {
    }

    public String getApplicationCode() {
        return this.applicationCode;
    }

    public void setApplicationCode(String applicationCode) {
        this.applicationCode = applicationCode;
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
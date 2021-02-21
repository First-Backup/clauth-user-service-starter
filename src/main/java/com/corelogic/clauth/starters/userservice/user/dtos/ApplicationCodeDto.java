package com.corelogic.clauth.starters.userservice.user.dtos;

public class ApplicationCodeDto {
    private String id;
    private String applicationCode;

    public ApplicationCodeDto() {
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getApplicationCode() {
        return this.applicationCode;
    }

    public void setApplicationCode(String applicationCode) {
        this.applicationCode = applicationCode;
    }

    public String toString() {
        return "ApplicationCodeDto{id='" + this.id + '\'' + ", applicationCode='" + this.applicationCode + '\'' + '}';
    }
}
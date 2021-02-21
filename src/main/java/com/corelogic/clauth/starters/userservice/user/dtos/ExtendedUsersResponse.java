package com.corelogic.clauth.starters.userservice.user.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.util.List;

public class ExtendedUsersResponse {
    private List<ExtendedUserResponse> users;
    @JsonInclude(Include.NON_NULL)
    private List<UserErrorMessages> errors;

    public ExtendedUsersResponse() {
    }

    public List<ExtendedUserResponse> getUsers() {
        return this.users;
    }

    public void setUsers(List<ExtendedUserResponse> users) {
        this.users = users;
    }

    public List<UserErrorMessages> getErrors() {
        return this.errors;
    }

    public void setErrors(List<UserErrorMessages> errors) {
        this.errors = errors;
    }
}

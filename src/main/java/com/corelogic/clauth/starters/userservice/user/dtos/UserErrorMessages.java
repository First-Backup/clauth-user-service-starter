package com.corelogic.clauth.starters.userservice.user.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

public class UserErrorMessages {
    private String emailAddress;
    private Boolean enabled;
    private String firstName;
    private String lastName;
    private String username;
    private String phoneNumber;
    private List<ErrorMessage> errorMessages = new ArrayList();

    public UserErrorMessages() {
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public List<ErrorMessage> getErrorMessages() {
        return this.errorMessages;
    }

    public void setErrorMessages(List<ErrorMessage> errors) {
        this.errorMessages = errors;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @JsonIgnore
    public void addError(ErrorMessage error) {
        this.errorMessages.add(error);
    }
}

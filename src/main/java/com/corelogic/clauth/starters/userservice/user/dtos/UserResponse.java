package com.corelogic.clauth.starters.userservice.user.dtos;

import com.corelogic.clauth.starters.userservice.mappers.LocalDateTimeDeserializer;
import com.corelogic.clauth.starters.userservice.mappers.LocalDateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.LocalDateTime;

public class UserResponse {
    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String emailAddress;
    private Boolean enabled;
    private String phoneNumber;
    private LocalDateTime createdDate;
    private String identityProvider;
    private LocalDateTime passwordLastModified;

    public UserResponse() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Boolean isEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @JsonSerialize(
            using = LocalDateTimeSerializer.class
    )
    public LocalDateTime getCreatedDate() {
        return this.createdDate;
    }

    @JsonDeserialize(
            using = LocalDateTimeDeserializer.class
    )
    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getIdentityProvider() {
        return this.identityProvider;
    }

    public void setIdentityProvider(String identityProvider) {
        this.identityProvider = identityProvider;
    }

    @JsonSerialize(
            using = LocalDateTimeSerializer.class
    )
    public LocalDateTime getPasswordLastModified() {
        return this.passwordLastModified;
    }

    @JsonDeserialize(
            using = LocalDateTimeDeserializer.class
    )
    public void setPasswordLastModified(LocalDateTime passwordLastModified) {
        this.passwordLastModified = passwordLastModified;
    }
}

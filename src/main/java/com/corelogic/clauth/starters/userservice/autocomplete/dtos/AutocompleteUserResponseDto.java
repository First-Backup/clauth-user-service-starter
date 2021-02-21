package com.corelogic.clauth.starters.userservice.autocomplete.dtos;

import com.corelogic.clauth.starters.userservice.mappers.LocalDateTimeDeserializer;
import com.corelogic.clauth.starters.userservice.mappers.LocalDateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.LocalDateTime;

public class AutocompleteUserResponseDto {
    private Long id;
    private String emailAddress;
    private Boolean enabled;
    private String firstName;
    private String lastName;
    private String username;
    private Long organizationId;
    private String organizationName;
    private String phoneNumber;
    private LocalDateTime passwordLastModified;
    private String applicationCode;
    private String identityProvider;

    public AutocompleteUserResponseDto() {
    }

    public String getIdentityProvider() {
        return this.identityProvider;
    }

    public void setIdentityProvider(String identityProvider) {
        this.identityProvider = identityProvider;
    }

    public String getApplicationCode() {
        return this.applicationCode;
    }

    public void setApplicationCode(String applicationCode) {
        this.applicationCode = applicationCode;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
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

    public Long getOrganizationId() {
        return this.organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public String getOrganizationName() {
        return this.organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
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

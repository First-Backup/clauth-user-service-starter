package com.corelogic.clauth.starters.userservice.user.dtos;

import java.util.Set;

public class UserApplicationCodesRequestDto {
    private Set<String> applicationCodes;

    public UserApplicationCodesRequestDto() {
    }

    public Set<String> getApplicationCodes() {
        return this.applicationCodes;
    }

    public void setApplicationCodes(Set<String> applicationCodes) {
        this.applicationCodes = applicationCodes;
    }
}
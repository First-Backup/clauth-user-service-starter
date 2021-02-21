package com.corelogic.clauth.starters.userservice.user.dtos;

import java.util.Set;

public class UserApplicationCodesResponseDto {
    private Set<ApplicationCodeDto> applications;

    public UserApplicationCodesResponseDto() {
    }

    public Set<ApplicationCodeDto> getApplications() {
        return this.applications;
    }

    public void setApplications(Set<ApplicationCodeDto> applications) {
        this.applications = applications;
    }
}
package com.corelogic.clauth.starters.userservice.autocomplete.dtos;

import java.util.List;

public class AutocompleteOrganizationResponseDto {
    private long id;
    private String name;
    private List<String> applicationCodes;

    public AutocompleteOrganizationResponseDto() {
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public List<String> getApplicationCodes() {
        return this.applicationCodes;
    }

    public void setApplicationCodes(List<String> applicationCodes) {
        this.applicationCodes = applicationCodes;
    }
}

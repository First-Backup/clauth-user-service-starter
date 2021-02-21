package com.corelogic.clauth.starters.userservice.autocomplete.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class AutocompleteResponse {
    @JsonProperty("user_result_set")
    private List<AutocompleteUserResponseDto> userResultSet;
    @JsonProperty("organization_result_set")
    private List<AutocompleteOrganizationResponseDto> organizationResultSet;

    public AutocompleteResponse() {
    }

    public List<AutocompleteUserResponseDto> getUserResultSet() {
        return this.userResultSet;
    }

    public void setUserResultSet(List<AutocompleteUserResponseDto> userResultSet) {
        this.userResultSet = userResultSet;
    }

    public void setOrganizationResultSet(List<AutocompleteOrganizationResponseDto> organizationResultSet) {
        this.organizationResultSet = organizationResultSet;
    }

    public List<AutocompleteOrganizationResponseDto> getOrganizationResultSet() {
        return this.organizationResultSet;
    }
}

package com.corelogic.clauth.starters.userservice.autocomplete;

import com.corelogic.clauth.starters.userservice.autocomplete.dtos.AutocompleteResponse;

public interface AutocompleteClient {
    AutocompleteResponse search(String input, String applicationCode);
}

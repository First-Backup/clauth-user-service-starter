package com.corelogic.clauth.starters.userservice.user.dtos;

public class PasswordComplexityResponse {
    private boolean lengthCheckValid;
    private boolean uppercaseCheckValid;
    private boolean lowercaseCheckValid;
    private boolean digitCheckValid;
    private boolean commonWordsCheckValid;
    private boolean accountNameCheckValid;
    private boolean passwordHistoryCheckValid;
    private String message = "";

    public PasswordComplexityResponse() {
    }

    public boolean isLengthCheckValid() {
        return this.lengthCheckValid;
    }

    public void setLengthCheckValid(boolean lengthCheckValid) {
        this.lengthCheckValid = lengthCheckValid;
    }

    public boolean isUppercaseCheckValid() {
        return this.uppercaseCheckValid;
    }

    public void setUppercaseCheckValid(boolean uppercaseCheckValid) {
        this.uppercaseCheckValid = uppercaseCheckValid;
    }

    public boolean isLowercaseCheckValid() {
        return this.lowercaseCheckValid;
    }

    public void setLowercaseCheckValid(boolean lowercaseCheckValid) {
        this.lowercaseCheckValid = lowercaseCheckValid;
    }

    public boolean isDigitCheckValid() {
        return this.digitCheckValid;
    }

    public void setDigitCheckValid(boolean digitCheckValid) {
        this.digitCheckValid = digitCheckValid;
    }

    public boolean isCommonWordsCheckValid() {
        return this.commonWordsCheckValid;
    }

    public void setCommonWordsCheckValid(boolean commonWordsCheckValid) {
        this.commonWordsCheckValid = commonWordsCheckValid;
    }

    public boolean isAccountNameCheckValid() {
        return this.accountNameCheckValid;
    }

    public void setAccountNameCheckValid(boolean accountNameCheckValid) {
        this.accountNameCheckValid = accountNameCheckValid;
    }

    public boolean isPasswordHistoryCheckValid() {
        return this.passwordHistoryCheckValid;
    }

    public void setPasswordHistoryCheckValid(boolean passwordHistoryCheckValid) {
        this.passwordHistoryCheckValid = passwordHistoryCheckValid;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isPolicyCompliant() {
        return this.uppercaseCheckValid && this.lowercaseCheckValid && this.digitCheckValid && this.accountNameCheckValid && this.commonWordsCheckValid && this.passwordHistoryCheckValid && this.lengthCheckValid;
    }
}

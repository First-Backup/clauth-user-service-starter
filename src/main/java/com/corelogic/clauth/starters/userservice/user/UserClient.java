package com.corelogic.clauth.starters.userservice.user;

import com.corelogic.clauth.starters.userservice.user.dtos.ExtendedUserRequest;
import com.corelogic.clauth.starters.userservice.user.dtos.ExtendedUserResponse;
import com.corelogic.clauth.starters.userservice.user.dtos.ExtendedUsersResponse;
import com.corelogic.clauth.starters.userservice.user.dtos.PasswordComplexityRequest;
import com.corelogic.clauth.starters.userservice.user.dtos.PasswordComplexityResponse;
import com.corelogic.clauth.starters.userservice.user.dtos.UpdatePasswordRequestDto;
import com.corelogic.clauth.starters.userservice.user.dtos.UpdatePasswordResponseDto;
import com.corelogic.clauth.starters.userservice.user.dtos.UserApplicationCodesRequestDto;
import com.corelogic.clauth.starters.userservice.user.dtos.UserApplicationCodesResponseDto;
import com.corelogic.clauth.starters.userservice.user.dtos.UserPasswordValidationRequest;
import com.corelogic.clauth.starters.userservice.user.dtos.UserPasswordValidationResponse;
import com.corelogic.clauth.starters.userservice.user.dtos.UserRequest;
import com.corelogic.clauth.starters.userservice.user.dtos.UsersRequest;

public interface UserClient {
    ExtendedUserResponse getUser(Long organizationId, Long userId);

    ExtendedUserResponse findUser(Long organizationId, String login);

    ExtendedUserResponse createUser(Long organizationId, ExtendedUserRequest userToBeCreated);

    ExtendedUserResponse createUser(Long organizationId, ExtendedUserRequest userToBeCreated, boolean suppressEmail);

    ExtendedUserResponse updateUser(Long organizationId, Long userId, UserRequest updatedUser);

    ExtendedUsersResponse getUsers(Long organizationId);

    ExtendedUsersResponse getUsersByApplicationCode(Long organizationId, String applicationCode);

    UserApplicationCodesResponseDto createUserApplicationCodes(Long organizationId, Long userId, UserApplicationCodesRequestDto userApplicationCodesRequestDto);

    UserApplicationCodesResponseDto getUserApplicationCodes(Long organizationId, Long userId);

    ExtendedUsersResponse createUsers(Long organizationId, UsersRequest usersToBeCreated);

    UserPasswordValidationResponse validatePassword(UserPasswordValidationRequest request);

    UpdatePasswordResponseDto updatePassword(UpdatePasswordRequestDto request);

    PasswordComplexityResponse checkPasswordComplexity(PasswordComplexityRequest request);

    void deleteUserApplicationCode(Long organizationId, Long userId, String applicationCode);
}

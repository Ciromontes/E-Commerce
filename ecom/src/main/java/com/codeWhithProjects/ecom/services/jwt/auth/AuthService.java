package com.codeWhithProjects.ecom.services.jwt.auth;

import com.codeWhithProjects.ecom.dto.SignupRequest;
import com.codeWhithProjects.ecom.dto.UserDto;

public interface AuthService {

    UserDto createUser(SignupRequest signupRequest);
    Boolean hasUserWithEmail(String email);
}

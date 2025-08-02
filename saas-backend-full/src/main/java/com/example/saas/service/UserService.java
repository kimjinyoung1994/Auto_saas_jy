package com.example.saas.service;

import com.example.saas.dto.*;

public interface UserService {
    UserResponse register(UserRequest request);
    JwtResponse login(LoginRequest request);
}

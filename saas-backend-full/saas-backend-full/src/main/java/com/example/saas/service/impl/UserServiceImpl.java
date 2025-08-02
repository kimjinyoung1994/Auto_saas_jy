package com.example.saas.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import com.example.saas.service.UserService;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    @Transactional
    public UserResponse register(UserRequest request) {
        // TODO: implement
        return null;
    }

    public JwtResponse login(LoginRequest request) {
        // TODO: implement
        return null;
    }
}

package com.lgcns.tct_backend.domain.user.service;

import com.lgcns.tct_backend.domain.user.entity.UserEntity;
import com.lgcns.tct_backend.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    public List<UserEntity> retrieveAllUsers() {
        return userRepository.findAll();
    }

}

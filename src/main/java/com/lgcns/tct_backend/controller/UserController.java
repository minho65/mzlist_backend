package com.lgcns.tct_backend.controller;

import com.lgcns.tct_backend.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService userService;

    @GetMapping("all")
    public ResponseEntity<?> retrieveAllUsers() {
        return ResponseEntity.ok(userService.retrieveAllUsers());
    }

}

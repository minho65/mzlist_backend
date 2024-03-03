package com.lgcns.tct_backend.controller;

import com.lgcns.tct_backend.domain.restuarant.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("restaurant")
@RestController
public class RestaurantController {

    private final RestaurantService restaurantService;

    @GetMapping("all")
    public ResponseEntity<?> retrieveAllRestaurant() {
        return ResponseEntity.ok(restaurantService.retrieveAllRestaurant());
    }

}

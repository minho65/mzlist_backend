package com.lgcns.tct_backend.domain.restuarant.service;

import com.lgcns.tct_backend.domain.restuarant.entity.RestaurantEntity;
import com.lgcns.tct_backend.domain.restuarant.repository.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;

    public List<RestaurantEntity> retrieveAllRestaurant() {
        return restaurantRepository.findAll();
    }

}

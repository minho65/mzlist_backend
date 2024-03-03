package com.lgcns.tct_backend.domain.restuarant.repository;

import com.lgcns.tct_backend.domain.restuarant.entity.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<RestaurantEntity, String> {
}

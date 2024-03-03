package com.lgcns.tct_backend.domain.restuarant.entity;

import com.lgcns.tct_backend.domain.mzlist.entity.OpenStatus;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "TB_RESTAURANT")
@Entity
public class RestaurantEntity {

    @Id
    @Column(name = "restaurant_id")
    private String restaurantId;

    @Column(name = "restaurant_name")
    private String restaurantName;

    @Column(name = "restaurant_address")
    private String restaurantAddress;

    @Column(name = "restaurant_category")
    private String restaurantCategory;

    @Enumerated(EnumType.STRING)
    @Column(name = "open_status")
    private OpenStatus openStatus;


}

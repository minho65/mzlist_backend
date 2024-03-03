package com.lgcns.tct_backend.domain.user.repository;

import com.lgcns.tct_backend.domain.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, String> {

}

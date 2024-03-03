package com.lgcns.tct_backend.domain.mzlist.repository;

import com.lgcns.tct_backend.domain.mzlist.entity.MzListEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MzListRepository extends JpaRepository<MzListEntity, String> {

    List<MzListEntity> findAllByUserId(String userId);

}

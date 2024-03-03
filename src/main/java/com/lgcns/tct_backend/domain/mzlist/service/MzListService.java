package com.lgcns.tct_backend.domain.mzlist.service;

import com.lgcns.tct_backend.domain.mzlist.repository.MzListRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Transactional
@RequiredArgsConstructor
@Service
public class MzListService {

    private final MzListRepository mzListRepository;

}

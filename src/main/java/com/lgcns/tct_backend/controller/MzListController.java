package com.lgcns.tct_backend.controller;

import com.lgcns.tct_backend.domain.mzlist.service.MzListService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/mzlist")
@RestController
public class MzListController {

    private final MzListService mzListService;

}

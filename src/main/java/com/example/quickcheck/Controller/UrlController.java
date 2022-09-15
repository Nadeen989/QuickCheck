package com.example.quickcheck.Controller;

import com.example.quickcheck.Repository.UrlRepository;
import com.example.quickcheck.Service.UrlService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/url")
@RestControllerAdvice
public class UrlController {


    private final UrlService urlService;

    public UrlController(UrlService urlService) {
        this.urlService = urlService;
    }

    @GetMapping
    public ResponseEntity getUrl(){
        return ResponseEntity.status(200).body(UrlRepository.
    }





}

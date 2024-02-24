package com.example.librarayM.controller;

import com.example.librarayM.service.LibrarayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibrarycardController {
    @Autowired
    private LibrarayService librarayService;



}

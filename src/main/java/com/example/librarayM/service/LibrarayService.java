package com.example.librarayM.service;

import com.example.librarayM.Repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibrarayService {
    @Autowired
    private LibraryRepository libraryRepository;

}

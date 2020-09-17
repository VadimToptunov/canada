package com.find.job.in.controller;

import com.find.job.in.service.LmiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class LmiaController {

    private LmiaService lmiaService;

    //TODO: Add architecture, create mappings

    @Autowired
    public LmiaController(LmiaService lmiaService){
        this.lmiaService = lmiaService;
    }

    @GetMapping("/")
    public ResponseEntity findByNoc(){
        return null;
    }

    @GetMapping("/")
    public ResponseEntity findByTerritory(){
        return null;
    }

    @GetMapping("/")
    public ResponseEntity findByAllNocs(){
        return null;
    }

    @GetMapping("/")
    public ResponseEntity findByAllTerritories(){
        return null;
    }

}

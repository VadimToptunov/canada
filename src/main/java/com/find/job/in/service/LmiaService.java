package com.find.job.in.service;

import com.find.job.in.entity.LmiaData;
import com.find.job.in.repository.LmiaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

//TODO: Add logic
public class LmiaService {
    private LmiaRepository lmiaRepository;

    @Autowired
    public LmiaService(LmiaRepository lmiaRepository){
        this.lmiaRepository = lmiaRepository;
    }

public List<LmiaData> findByNocAndTerritories(){
        return lmiaRepository.findAll();

    }
}

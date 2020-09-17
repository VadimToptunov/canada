package com.find.job.in.controller;

import com.find.job.in.service.LmiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class LmiaController {

    private LmiaService lmiaService;

    //TODO: Add architecture, create mappings

    @Autowired
    public LmiaController(LmiaService lmiaService) {
        this.lmiaService = lmiaService;
    }

    @RequestMapping(
            value = "/",
            params = {"noc", "territory"},
            method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity findByNocAndTerritories(@RequestParam("noc") String noc,
                                                  @RequestParam("territory") String territory){
        return ResponseEntity.ok(lmiaService.findByNocAndTerritories());
    }

}

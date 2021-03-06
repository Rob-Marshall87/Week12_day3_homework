package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/whiskies")
public class WhiskyController {

    @Autowired
    WhiskyRepository whiskyRepository;

    @GetMapping(value = "/year/{year}")
    public List<Whisky> getWhiskyByYear(@PathVariable int year){
        return whiskyRepository.getWhiskyByYear(year);
    }

    @GetMapping(value = "/distillery/{distilleryId}")
    public List<Whisky> getWhiskyByDistilleryId(@PathVariable Long distilleryId){
        return whiskyRepository.getWhiskyByDistilleryId(distilleryId);
    }

    @GetMapping(value = "/distillery-and-year/{distilleryId}/{year}")
    public List<Whisky> getWhiskyByDistilleryIdAndYear(@PathVariable Long distilleryId, @PathVariable int year){
        return whiskyRepository.getWhiskyByDistilleryIdAndYear(distilleryId, year);
    }

}

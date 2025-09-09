package com.example.career.controller;
import com.example.career.entity.CareerRecord;
import com.example.career.service.CareerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/careers")
public class CareerController {
    @Autowired private CareerService service;
    @PostMapping
    public ResponseEntity<CareerRecord> create(@RequestBody CareerRecord r){
        return ResponseEntity.ok(service.add(r));
    }
}

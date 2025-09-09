package com.example.achievements.controller;
import com.example.achievements.entity.Achievement;
import com.example.achievements.service.AchievementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/achievements")
public class AchievementController {
    @Autowired private AchievementService service;
    @PostMapping
    public ResponseEntity<Achievement> create(@RequestBody Achievement a){
        return ResponseEntity.ok(service.add(a));
    }
}

package com.example.graduate.controller;
import com.example.graduate.entity.Graduate;
import com.example.graduate.service.GraduateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;
@RestController
@RequestMapping("/api/graduates")
public class GraduateController {
    @Autowired private GraduateService service;
    @PostMapping
    public ResponseEntity<Graduate> create(@RequestBody Graduate g){
        return ResponseEntity.ok(service.createGraduate(g));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Graduate> get(@PathVariable Long id){
        Optional<Graduate> res = service.getGraduateById(id);
        return res.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}

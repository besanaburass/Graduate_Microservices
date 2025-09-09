package com.example.achievements.service;
import com.example.achievements.entity.Achievement;
import com.example.achievements.repository.AchievementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AchievementService {
    @Autowired private AchievementRepository repo;
    public Achievement add(Achievement a){ return repo.save(a); }
}

package com.example.achievements.repository;
import com.example.achievements.entity.Achievement;
import org.springframework.data.jpa.repository.JpaRepository;
public interface AchievementRepository extends JpaRepository<Achievement, Long> {}

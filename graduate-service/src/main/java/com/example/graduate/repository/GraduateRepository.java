package com.example.graduate.repository;
import com.example.graduate.entity.Graduate;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
public interface GraduateRepository extends JpaRepository<Graduate, Long> {
    Optional<Graduate> findByStudentId(String studentId);
}

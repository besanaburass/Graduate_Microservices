package com.example.career.repository;
import com.example.career.entity.CareerRecord;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CareerRecordRepository extends JpaRepository<CareerRecord, Long> {}

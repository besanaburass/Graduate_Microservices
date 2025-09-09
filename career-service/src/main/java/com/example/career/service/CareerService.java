package com.example.career.service;
import com.example.career.entity.CareerRecord;
import com.example.career.repository.CareerRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CareerService {
    @Autowired private CareerRecordRepository repo;
    public CareerRecord add(CareerRecord r){ return repo.save(r); }
}

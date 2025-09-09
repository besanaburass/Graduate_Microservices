package com.example.graduate.service;
import com.example.graduate.entity.Graduate;
import com.example.graduate.repository.GraduateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import java.util.Optional;
@Service
public class GraduateService {
    @Autowired private GraduateRepository repo;
    @Autowired private KafkaTemplate<String,String> kafka;
    public Graduate createGraduate(Graduate g){
        Graduate saved = repo.save(g);
        kafka.send("graduate-registrations","New graduate registered: "+saved.getFullName()+" (ID: "+saved.getId()+")");
        return saved;
    }
    public Optional<Graduate> getGraduateById(Long id){ return repo.findById(id); }
}

package com.example.network.listener;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
@Component
public class GraduateRegistrationListener {
    @KafkaListener(topics = "graduate-registrations", groupId = "network-service")
    public void handleGraduateRegistration(String message){
        System.out.println("Received message: " + message);
    }
}

package com.example.achievements.entity;
import jakarta.persistence.*;
@Entity
public class Achievement {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long graduateId;
    private String title;
    @Column(length=2000)
    private String description;
    public Long getId(){return id;} public void setId(Long id){this.id=id;}
    public Long getGraduateId(){return graduateId;} public void setGraduateId(Long v){this.graduateId=v;}
    public String getTitle(){return title;} public void setTitle(String v){this.title=v;}
    public String getDescription(){return description;} public void setDescription(String v){this.description=v;}
}

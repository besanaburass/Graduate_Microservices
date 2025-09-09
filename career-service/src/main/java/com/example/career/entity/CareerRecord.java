package com.example.career.entity;
import jakarta.persistence.*;
@Entity
public class CareerRecord {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long graduateId;
    private String company;
    private String position;
    private Integer startYear;
    private Integer endYear;
    public Long getId(){return id;} public void setId(Long id){this.id=id;}
    public Long getGraduateId(){return graduateId;} public void setGraduateId(Long v){this.graduateId=v;}
    public String getCompany(){return company;} public void setCompany(String v){this.company=v;}
    public String getPosition(){return position;} public void setPosition(String v){this.position=v;}
    public Integer getStartYear(){return startYear;} public void setStartYear(Integer v){this.startYear=v;}
    public Integer getEndYear(){return endYear;} public void setEndYear(Integer v){this.endYear=v;}
}

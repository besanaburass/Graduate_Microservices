package com.example.graduate.entity;
import jakarta.persistence.*;
@Entity
public class Graduate {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    @Column(unique = true, nullable = false)
    private String studentId;
    private String email;
    private Integer graduationYear;
    public Long getId(){return id;} public void setId(Long id){this.id=id;}
    public String getFullName(){return fullName;} public void setFullName(String v){this.fullName=v;}
    public String getStudentId(){return studentId;} public void setStudentId(String v){this.studentId=v;}
    public String getEmail(){return email;} public void setEmail(String v){this.email=v;}
    public Integer getGraduationYear(){return graduationYear;} public void setGraduationYear(Integer v){this.graduationYear=v;}
}

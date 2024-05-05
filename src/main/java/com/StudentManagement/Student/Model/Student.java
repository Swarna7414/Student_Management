package com.StudentManagement.Student.Model;


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Student_detials")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer age;

    private String adress;

    private Integer contactnumber;

    @ManyToMany(mappedBy = "students")
    private Set<Course> course = new HashSet<>();

    @ManyToMany(mappedBy = "student",cascade = CascadeType.ALL)
    private Set<Grade> grades = new HashSet<>();

    public Student() {

    }

    public Student(Long id, String name, Integer age, String adress, Integer contactnumber, Set<Course> course, Set<Grade> grades) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.adress = adress;
        this.contactnumber = contactnumber;
        this.course = course;
        this.grades = grades;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Integer getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(Integer contactnumber) {
        this.contactnumber = contactnumber;
    }

    public Set<Course> getCourse() {
        return course;
    }

    public void setCourse(Set<Course> course) {
        this.course = course;
    }

    public Set<Grade> getGrades() {
        return grades;
    }

    public void setGrades(Set<Grade> grades) {
        this.grades = grades;
    }
}

package com.StudentManagement.Student.Model;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Date startdate;

    private Date enddate;

    @ManyToOne
    private Teacher teacher;

    @ManyToMany
    private Set<Student> students = new HashSet<>();

    @OneToMany
    private Set<Grade> grades = new HashSet<>();

    public Course() {

    }

    public Course(Long id, String name, Date startdate, Date enddate, Teacher teacher, Set<Student> students, Set<Grade> grades) {
        this.id = id;
        this.name = name;
        this.startdate = startdate;
        this.enddate = enddate;
        this.teacher = teacher;
        this.students = students;
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

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public Set<Grade> getGrades() {
        return grades;
    }

    public void setGrades(Set<Grade> grades) {
        this.grades = grades;
    }
}

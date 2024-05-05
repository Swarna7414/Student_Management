package com.StudentManagement.Student.Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "grades")
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer score;

    private Date date;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Course course;

    public Grade() {
    }

    public Grade(Long id, Integer score, Date date, Student student, Course course) {
        this.id = id;
        this.score = score;
        this.date = date;
        this.student = student;
        this.course = course;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}

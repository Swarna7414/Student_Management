package com.StudentManagement.Student.Model;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import jakarta.persistence.*;

@Entity
@Table(name = "teachers")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String teachername;
    private String email;

    private Integer contactnumber;

    public Teacher() {
    }

    public Teacher(Long id, String teachername, String email, Integer contactnumber) {
        this.id = id;
        this.teachername = teachername;
        this.email = email;
        this.contactnumber = contactnumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(Integer contactnumber) {
        this.contactnumber = contactnumber;
    }
}

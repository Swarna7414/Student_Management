package com.StudentManagement.Student.Repository;

import com.StudentManagement.Student.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}

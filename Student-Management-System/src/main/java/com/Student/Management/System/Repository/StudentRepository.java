package com.Student.Management.System.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Student.Management.System.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}

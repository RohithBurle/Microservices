package com.example.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event.ID;

import com.example.student.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}

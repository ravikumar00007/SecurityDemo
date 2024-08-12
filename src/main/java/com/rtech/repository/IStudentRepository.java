package com.rtech.repository;

import com.rtech.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepository extends JpaRepository<StudentEntity, Integer> {
}

package com.rtech.service;

import com.rtech.entity.StudentEntity;

public interface IStudentMgmtService {
    public String registerStudent(StudentEntity student);
    public String showAllStudents();
}

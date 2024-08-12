package com.rtech.service.impl;

import com.rtech.entity.StudentEntity;
import com.rtech.repository.IStudentRepository;
import com.rtech.service.IStudentMgmtService;
import org.hibernate.annotations.SecondaryRow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class StudentMgmtServiceImpl implements IStudentMgmtService {
    @Autowired
    private IStudentRepository stRepository;
    @Override
    public String registerStudent(StudentEntity student) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encode = encoder.encode(student.getPwd());
        student.setPwd(encode);
        stRepository.save(student);
        return "Student is registered";
    }

    @Override
    public String showAllStudents() {
        return "";
    }
}
